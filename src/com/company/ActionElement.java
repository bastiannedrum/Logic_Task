package com.company;

interface RunAction
{
    String run(String str);
}

public class ActionElement
{
    private String text;
    private String action;
//public RunAction action;

    public String getText() {
        return text;
    }

    public String getAction() {
        return action;
    }

    public ActionElement(String action, String text) {
        this.text = text;
        this.action = action;
    }
}
