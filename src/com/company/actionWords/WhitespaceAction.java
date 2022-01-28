package com.company.actionWords;

import com.company.ActionInterface;

public class WhitespaceAction implements ActionInterface {
    public String actionMethode(String text)
    {
        return text.replaceAll("\\s+","");
    }



    public String getActionName() {
        return "WHITESPACE";
    }
}
