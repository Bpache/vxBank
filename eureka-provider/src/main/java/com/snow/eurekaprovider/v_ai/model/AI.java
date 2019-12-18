package com.snow.eurekaprovider.v_ai.model;

public class AI {
    private Integer aiId;

    private String aiKeyword;

    private String aiRespones;

    public AI(Integer aiId, String aiKeyword, String aiRespones) {
        this.aiId = aiId;
        this.aiKeyword = aiKeyword;
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

    public String getAiKeyword() {
        return aiKeyword;
    }

    public void setAiKeyword(String aiKeyword) {
        this.aiKeyword = aiKeyword == null ? null : aiKeyword.trim();
    }

    public String getAiRespones() {
        return aiRespones;
    }

    public void setAiRespones(String aiRespones) {
        this.aiRespones = aiRespones == null ? null : aiRespones.trim();
    }
}