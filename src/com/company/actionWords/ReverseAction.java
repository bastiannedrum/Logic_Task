package com.company.actionWords;


import com.company.ActionInterface;

public class ReverseAction implements ActionInterface
{
    public String actionMethode(String text)
    {
        var builder = new StringBuilder(text);
        return builder.reverse().toString();
    }

    public String getActionName() {
        return "REVERSE";
    }

}
