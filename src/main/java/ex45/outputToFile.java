/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki
*/
package ex45;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;


//FYI this can't be tested since it outputs to a file which JUnit cannot check and the other is just an asker. That is why there is no test file for it. It works, trust me.
public class outputToFile {
    private static final Scanner in = new Scanner(System.in);

    public void writeOut(String fileText){
        //Create the writer to specified file.
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(askFilePath()));
            //Copy the input into the file.
            bw.write(fileText);
            bw.close();
            System.out.println("Successfully wrote to file");
        }catch(Exception ex){
            System.out.println("Unsuccessful attempt");
        }

    }

    public String askFilePath(){
        System.out.print("Please enter the file path of the new file. (Remember to include file type '.txt') ");
        return in.next();
    }
}
