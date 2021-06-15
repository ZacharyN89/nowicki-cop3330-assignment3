/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki
*/

package ex42;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class fileReader {
    //We will use a reader and an ArrayList to hold all of the lines of information.
    private static BufferedReader br;
    ArrayList<String> listOfNames = new ArrayList<String>();

    public ArrayList<String> getList(){
        return listOfNames;
    }

    public BufferedReader makeFileReader(){
        //Make the file reader.
        try{
            br = new BufferedReader(
                    new FileReader("exercise42_input.txt"));
        }catch(Exception ex){
            System.out.print("Can't find file.");
        }
        return br;
    }

    public void readFile(){
        //Loop through until end of file.
        String hold;
        int count = 0;
        while((hold = readFileLine()) != null){
            //Add every line as a string.
            listOfNames.add(hold);
        }
    }

    public String readFileLine(){
        String result = "";

        //Using the input stream grab the next line.
        try {
            result = br.readLine();
        }catch(Exception ex){
            System.out.print("Can't find line.");
        }

        return result;
    }
}
