package com.debugger.pojo;

import java.util.ArrayList;
import java.util.List;

public class BugSpecOne {

    private  String question;
    private List<String> answer =new ArrayList<String>();
    private  int arIndex;
    private  int bugId;
    private  boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public BugSpecOne(){
        success = false;

    }

    public int getArIndex() {
        return arIndex;
    }

    public void setArIndex(int arIndex) {
        this.arIndex = arIndex;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswer() {
        return answer;
    }

    public void setAnswer(List<String> answer) {
        this.answer = answer;
    }


    public int getBugId() {
        return bugId;
    }

    public void setBugId(int bugId) {
        this.bugId = bugId;
    }
}
