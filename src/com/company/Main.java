package com.company;

import com.company.actionWords.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args)
    {
        //ActionInterface should be crucial, intelliJ does not think so
        //todo make ActionInterface necessary
        var actionDictionary = new ArrayList<ActionInterface>(Arrays.asList(
                new ReverseAction()
                ,new CapitalizeAction()
                ,new WhitespaceAction()
                ,new UniqueCountAction()
                ,new PalindromeAction()
        ));
        var actionList = createActionList("./src/com/company/data/actiontexts.txt");
        var testList = createActionList("./src/com/company/data/testAction.txt");

        runActionList(actionDictionary, actionList);
        runActionList(actionDictionary, testList);
    }

    private static void runActionList(ArrayList<ActionInterface> actionDictionary, ArrayList<ActionElement> actionList)
    {
        int lineCount = 1;
        for(var i : actionList)
            for(var j : actionDictionary)
                if(j.getActionName().equals(i.getAction()))
                {
                    System.out.println("lineCount:"+ lineCount +"\t|Text: ["+ i.getText() +"] ran Action: [" + i.getAction() + "] with result: [" + j.actionMethode(i.getText())+ "]");
                    lineCount++;
                    break;
                }
    }

    private static ArrayList<ActionElement> createActionList(String filePath)
    {
        var actionList = new ArrayList<ActionElement>();
        try
        {
            var data = new File(filePath);
            var text = new Scanner(data);
            while (text.hasNextLine())
            {
                String line = text.nextLine();
                actionList.add(stringToActionElement(line));
            }
        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return actionList;
    }

    private static ActionElement stringToActionElement(String textLine)
    {

        String action = "";
        String text = "";

        var actionMatcher = Pattern.compile(".+(?=:)").matcher(textLine); // regex finds everything before ":"
        var textMatcher = Pattern.compile("(?<=:).*").matcher(textLine); // everything after

        while (actionMatcher.find())
            action = actionMatcher.group(0);
        //todo see if this is a correct implementation

        while (textMatcher.find())
            text = textMatcher.group(0);

        return new ActionElement(action, text);
    }
}
