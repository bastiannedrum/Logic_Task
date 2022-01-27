package com.company;

interface RunAction
{
    String run(String str);
}

public class ActionElement
{
    private String action;
    private String text;

    public String getText() {
        return text;
    }

    public String getAction() {
        return action;
    }

    @Override
    public String toString() {
        return "ActionElement{" +
                ", action='" + action + '\'' +
                "text='" + text + '\'' +
                '}';
    }

    public ActionElement(String action, String text) {
        this.text = text;
        this.action = action;
    }
}
