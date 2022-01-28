package com.company.actionWords;

import com.company.ActionInterface;

public class PalindromeAction implements ActionInterface
{
    public String actionMethode(String text)
    {
        boolean isPalindrome = true;
        for(int i = 0; i < text.length()/2; i++)
            if (!text.substring(i, i + 1).equals(text.substring(text.length() - i -1, text.length() - i)))
            {
                isPalindrome = false;
                break;
            }

        return Boolean.toString(isPalindrome);
    }

    public String getActionName() {return "PALINDROME";}
}
