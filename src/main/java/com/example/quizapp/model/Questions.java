package com.example.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Questions {
    @Id
    private Long quesId;
    private String title;
    private String optionA;
    private String optionB;
    private String optionC;
    private int ans;
    private int chose;

    // Getters and Setters
    public Long getQuesId() { return quesId; }
    public void setQuesId(Long quesId) { this.quesId = quesId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getOptionA() { return optionA; }
    public void setOptionA(String optionA) { this.optionA = optionA; }
    public String getOptionB() { return optionB; }
    public void setOptionB(String optionB) { this.optionB = optionB; }
    public String getOptionC() { return optionC; }
    public void setOptionC(String optionC) { this.optionC = optionC; }
    public int getAns() { return ans; }
    public void setAns(int ans) { this.ans = ans; }
    public int getChose() { return chose; }
    public void setChose(int chose) { this.chose = chose; }
}