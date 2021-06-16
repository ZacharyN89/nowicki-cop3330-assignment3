/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki
*/

package ex45;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class findAndReplace {
    private static Path filePath = Paths.get("exercise45_input.txt");

    public String getFile(){
        String fileText;

        //Turn the file text into a string.
        try {
            fileText = Files.readString(filePath);
        }catch(Exception ex){
            fileText = "Cannot find file.";
        }

        return fileText;
    }

    public String replace(String fileText){
        //Find and replace the word 'utilize' with the word 'use'.
        fileText = fileText.replaceAll("utilize","use");

        return fileText;
    }
}
