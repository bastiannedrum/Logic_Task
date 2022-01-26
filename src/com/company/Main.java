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
                var actionLine = StringToAction(line);
                System.out.println(actionLine.getAction() + "" + actionLine.getText());
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();

        }
        File directory = new File("./");
        System.out.println(directory.getAbsolutePath());

    }

    private static ActionElement StringToAction(String textLine)
    {
        // todo add try
        String action = ":(";
        String text = ":)";

        Pattern pattern = Pattern.compile("(.*):");
        Matcher m = pattern.matcher(textLine);

        Pattern pattern2 = Pattern.compile(":(.*)");
        Matcher m2 = pattern2.matcher(textLine);

        while (m.find())
            action = m.group(0);

        while (m2.find())
            text = m2.group(0);

        return new ActionElement(action, text);
    }
}
