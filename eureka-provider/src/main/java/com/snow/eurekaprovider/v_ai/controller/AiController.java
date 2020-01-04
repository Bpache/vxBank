package com.snow.eurekaprovider.v_ai.controller;


import com.snow.eurekaprovider.util.JsonData;
import com.snow.eurekaprovider.v_ai.model.AI;
import com.snow.eurekaprovider.v_ai.service.IAIservice;
import com.snow.eurekaprovider.v_statis.model.Keyword;
import com.snow.eurekaprovider.v_statis.service.IStatisService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

@RestController
@RequestMapping("/ai")
public class AiController {

    @Autowired
    private IAIservice aIservice;

    @Autowired
    private IStatisService statisService;

    private JsonData jd;

    @RequestMapping("/add")
    public JsonData addAi(@RequestBody AI ai) {
        int n = aIservice.insert(ai);
        jd = new JsonData();
        String msg = "操作成功！";
        if(n<1){
            msg = "操作失败！";
        }
        jd.setMessage(msg);
        return jd;
    }

    @RequestMapping("/del")
    public JsonData delAi(@RequestBody AI ai) {
        int n = aIservice.deleteByPrimaryKey(ai.getAiId());
        jd = new JsonData();
        String msg = "操作成功！";
        if(n<1){
            msg = "操作失败！";
        }
        jd.setMessage(msg);
        return jd;
    }


    @RequestMapping("/list")
    public JsonData list(@RequestBody AI ai){
        jd = new JsonData();
        List<AI> list = aIservice.load(ai);
        String msg = "查询成功！";
        if(list.size()<1){
            msg = "查询无结果";
        }
        jd.setMessage(msg);
        jd.setPageInfo(list);
        return jd;
    }

    @RequestMapping("/edit")
    public JsonData edit(@RequestBody AI ai){
        int n = aIservice.updateByPrimaryKey(ai);
        jd = new JsonData();
        String msg = "操作成功！";
        if(n<1){
            msg = "操作失败！";
        }
        jd.setMessage(msg);
        return jd;
    }

/*图灵接入授权*/
    private static final String URL = "http://openapi.tuling123.com/openapi/api/v2";
    private static final String APIKEY = "c8b74e9dc90543248b07566e35cfdd3b";
    private static final String USERID = "538820";
/*图灵请求参数*/
    public String getReqMes(String msg){
        jd = new JsonData();
        // 请求json，里面包含reqType，perception，userInfo
        JSONObject reqJson = new JSONObject();
        // 输入类型:0-文本(默认)、1-图片、2-音频
        int reqType = 0;
        reqJson.put("reqType",reqType);

        // 输入信息,里面包含inputText，inputImage，selfInfo
        JSONObject perception = new JSONObject();
        // 输入的文本信息
        JSONObject inputText = new JSONObject();
        inputText.put("text",msg);
        perception.put("inputText",inputText);
        // 用户信息
        JSONObject userInfo = new JSONObject();
        userInfo.put("apiKey",APIKEY);
        userInfo.put("userId",USERID);

        reqJson.put("perception",perception);
        reqJson.put("userInfo",userInfo);
        return reqJson.toString();
    }

    /*图灵提交方法*/
    public String tulinPost(String msg) {
        String reqMes = getReqMes(msg);
        String status = "";
        String responseStr = "";
        PrintWriter out = null;
        BufferedReader in = null;
        try {
            java.net.URL realUrl = new URL(URL);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            HttpURLConnection httpUrlConnection = (HttpURLConnection) conn;
            // 设置请求属性
            httpUrlConnection.setRequestProperty("Content-Type", "application/json");
            httpUrlConnection.setRequestProperty("x-adviewrtb-version", "2.1");
            // 发送POST请求必须设置如下两行
            httpUrlConnection.setDoOutput(true);
            httpUrlConnection.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(httpUrlConnection.getOutputStream());
            // 发送请求参数
            out.write(reqMes);
            // flush输出流的缓冲
            out.flush();
            httpUrlConnection.connect();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(httpUrlConnection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                responseStr += line;
            }
            status = new Integer(httpUrlConnection.getResponseCode()).toString();
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
        }
        // 使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) { out.close();}
                if (in != null) {in.close();}
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        //返回的字符串
        return responseStr;
    }

    public String getResultMes(String tulinPostStr){

        JSONObject thesultStr = JSONObject.fromObject(tulinPostStr);

        List<Object> results = (List<Object>) thesultStr.get("results");

        JSONObject resultObj = JSONObject.fromObject(results.get(0));

        JSONObject values = JSONObject.fromObject(resultObj.get("values"));

        return values.get("text").toString();
    }


    @RequestMapping("/chat")
    public String chat(String msg){
        String str = "";
        String RequestMsg = tulinPost(msg);
        str = getReqMes(RequestMsg);

     /*   AI aitest = new AI();
        //设置关键字
        aitest.setAiQuestion(msg);
        //到AI表里查询是否有该关键字
        List<AI> keys = aIservice.load(aitest);

        Keyword keyword = new Keyword();
        if(keys.size()<1){//ai表里面没有用户输入的关键字
            keyword.setKeyName(msg);
            //添加到关键字统计表
            Keyword keyword2 = statisService.getByName(keyword.getKeyName());
            if(keyword2 == null){
                keyword.setKeyName(keyword.getKeyName());
                keyword.setKeySum(1);
                keyword.setType(0);
                statisService.addKey(keyword);
            }else{
                statisService.updateKeySum(keyword.getKeyName());
            }
        }else{//ai表里面有用户输入的关键字
            String keyname = keys.get(0).getAiQuestion();
            Keyword keyword1 = statisService.getByName(keyname);//匹配ai表里面的关键字
            if (keyword1 == null) {//关键字表如果没有 就加到关键字表
                keyword.setKeyName(keyname);
                keyword.setKeySum(1);
                keyword.setType(1);
                statisService.addKey(keyword);
            } else {//如果有 关键字条数就加一
                statisService.updateKeySum(keyname);
            }
        }
*/


        return str;
    }




}
