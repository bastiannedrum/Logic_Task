package com.company.actionWords;

import com.company.ActionInterface;

public class CapitalizeAction implements ActionInterface
{
    // only changes the first letter
    public String actionMethode(String text)
    {
        return text.substring(0,1).toLowerCase() + text.substring(1);
    }

    public String getActionName() {
        return "CAPITALIZE";
    }
}
