package com.snow.eurekaconsumer.v_ai.model;

public class AI {
    private Integer aiId;

    private String aiQuestion;

    private String aiQuestion1;

    private String aiQuestion2;

    private String aiQuestion3;

    private String aiQuestion4;

    private String aiQuestion5;

    private String aiRespones;

    public AI(Integer aiId, String aiQuestion, String aiQuestion1, String aiQuestion2, String aiQuestion3, String aiQuestion4, String aiQuestion5, String aiRespones) {
        this.aiId = aiId;
        this.aiQuestion = aiQuestion;
        this.aiQuestion1 = aiQuestion1;
        this.aiQuestion2 = aiQuestion2;
        this.aiQuestion3 = aiQuestion3;
        this.aiQuestion4 = aiQuestion4;
        this.aiQuestion5 = aiQuestion5;
        this.aiRespones = aiRespones;
    }

    public AI() {
        super();
    }

    public Integer getAiId() {
        return aiId;
    }

    public void setAiId(Integer aiId) {
        this.aiId = aiId;
    }

    public String getAiQuestion() {
        return aiQuestion;
    }

    public void setAiQuestion(String aiQuestion) {
        this.aiQuestion = aiQuestion == null ? null : aiQuestion.trim();
    }

    public String getAiQuestion1() {
        return aiQuestion1;
    }

    public void setAiQuestion1(String aiQuestion1) {
        this.aiQuestion1 = aiQuestion1 == null ? null : aiQuestion1.trim();
    }

    public String getAiQuestion2() {
        return aiQuestion2;
    }

    public void setAiQuestion2(String aiQuestion2) {
        this.aiQuestion2 = aiQuestion2 == null ? null : aiQuestion2.trim();
    }

    public String getAiQuestion3() {
        return aiQuestion3;
    }

    public void setAiQuestion3(String aiQuestion3) {
        this.aiQuestion3 = aiQuestion3 == null ? null : aiQuestion3.trim();
    }

    public String getAiQuestion4() {
        return aiQuestion4;
    }

    public void setAiQuestion4(String aiQuestion4) {
        this.aiQuestion4 = aiQuestion4 == null ? null : aiQuestion4.trim();
    }

    public String getAiQuestion5() {
        return aiQuestion5;
    }

    public void setAiQuestion5(String aiQuestion5) {
        this.aiQuestion5 = aiQuestion5 == null ? null : aiQuestion5.trim();
    }

    public String getAiRespones() {
        return aiRespones;
    }

    public void setAiRespones(String aiRespones) {
        this.aiRespones = aiRespones == null ? null : aiRespones.trim();
    }
}