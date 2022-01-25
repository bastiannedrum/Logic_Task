package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            var data = new File("./src/com/company/actiontexts.txt");
            var text = new Scanner(data);
            while (text.hasNextLine())
            {
                String line = text.nextLine();
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();

        }
        File directory = new File("./");
        System.out.println(directory.getAbsolutePath());
    }
}
