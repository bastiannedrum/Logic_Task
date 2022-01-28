package com.company.actionWords;

import com.company.ActionInterface;

import java.util.ArrayList;

public class UniqueCountAction implements ActionInterface
{
    // Looks for all characters not just letters, capital is a different letter
    public String actionMethode(String text)
    {
        var uniqueLetters = new ArrayList<String>();

        for(int i = 0 ; i < text.length(); i++)
        {
            boolean isNew = true;
            for(var j : uniqueLetters)
                if (j.equals(text.substring(i, i + 1)))
                {
                    isNew = false;
                    break;
                }
            if(isNew) uniqueLetters.add(text.substring(i, i + 1));
        }
        return Integer.toString(uniqueLetters.size());
    }

    public String getActionName() {return "UNIQUE_COUNT";}
}
