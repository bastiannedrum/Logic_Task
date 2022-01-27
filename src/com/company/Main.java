package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        var actionList = new ArrayList<ActionElement>();
        var actionDictonary = new ArrayList<ActionTypes>();
        try {
            var data = new File("./src/com/company/actiontexts.txt");
            var text = new Scanner(data);
            while (text.hasNextLine())
            {
                String line = text.nextLine();
                actionList.add(StringToAction(line));
            }
            for(var i : actionList)
                System.out.println(i);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();

        }

    }

    private static ActionElement StringToAction(String textLine)
    {
        // todo add try
        String action = ":(";
        String text = ":)";

        Pattern actionPattern = Pattern.compile(".+(?=:)");
        Matcher actionMatcher = actionPattern.matcher(textLine);

        Pattern textPattern = Pattern.compile("(?<=:).*");
        Matcher textMatcher = textPattern.matcher(textLine);

        while (actionMatcher.find())
            action = actionMatcher.group(0);

        while (textMatcher.find())
            text = textMatcher.group(0);

        return new ActionElement(action, text);
    }
}
