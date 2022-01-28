package com.company;

public class ActionElement
{
    private String action;
    private String text;

    public ActionElement(String action, String text)
    {
        this.text = text;
        this.action = action;
    }

    @Override
    public String toString()
    {
        return "ActionElement{" +
                "action='" + action + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public String getAction() {
        return action;
    }
    public String getText() {return text;}
}
