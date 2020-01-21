package com.cremaconsulting.simplejournal.model;

public class Goal {

    public String text;
    public Boolean complete;

    public Goal(String text, Boolean complete) {
        this.text = text;
        this.complete = complete;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }
}
