package com.example.demo.Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ReportData {
    private String toEmail;
    private List<ReportContent> content;

    public ReportData(){
        this.content = new ArrayList<>();
    }

    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public List<ReportContent> getContent() {
        return content;
    }

    public void setContent(List<ReportContent> content) {
        this.content = content;
    }

    public void addToContent(ReportContent element){
        this.content.add(element);
    }
}

