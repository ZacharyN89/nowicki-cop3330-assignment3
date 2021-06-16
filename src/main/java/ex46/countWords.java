/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki
*/

package ex46;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countWords {
    private static Path filePath = Paths.get("exercise46_input.txt");

    public String parseFile(){
        String fileText;

        //Turn the file text into a string.
        try {
            fileText = Files.readString(filePath);
        }catch(Exception ex){
            fileText = "Cannot find file.";
        }

        return fileText;
    }

    public String removeLineBreaks(String input){
        //Replace all line breaks with spaces.
        input = input.replace("\n", " ").replace("\r", "");
        return input;
    }

    public ArrayList<String> makeList(String input){
        //Return a string as a list of words.
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(input.split(" ")));
        return list;
    }

    public ArrayList<String> removeBlanks(ArrayList<String> input){
        //If the list contains blank instances it removes them and returns a new list without any blanks.
        ArrayList<String> result = input;
        for(int i=0; i<input.size(); i++){
            if(result.get(i).isBlank()){
                result.remove(i);
            }
        }
        return result;
    }

    public Map<String,Integer> countWords(ArrayList<String> words){
        int curWords = 0;
        Map<String,Integer> wordCount = new HashMap<String,Integer>();
        String compare;
        boolean check;

        //Loop through the list of words.
        for(int i=0; i<words.size(); i++){
            check = false;

            //Get the current word.
            compare = words.get(i);


            //If the word is in the ist of maps then increment the value of the map by one.
            if((wordCount.containsKey(compare))){
                check = true;
                wordCount.put(compare, wordCount.get(compare)+1);
            }

            //If the word is not in the list of maps add it with a value of '1'.
            if(!check){
                wordCount.put(compare,1);
                curWords++;
            }
        }

        return wordCount;
    }

    public String makeChart(Map<String,Integer> input){
        Map<String,Integer> map = input;
        String result = "";
        //Loop through and print the greatest amount of occurrences every time until there are no more values.
        while(!map.isEmpty()){
            Integer max = 0;
            String maxKey = "";

            //Find the entry with the largest value.
            for (Map.Entry<String,Integer> entry : map.entrySet()) {
                if(entry.getValue() > max){
                    max = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            //Create a string with an equal amount of '*' to the value.
            String count = "";
            for(int i=0; i<max; i++){
                count += "*";
            }

            //Add a formatted line that include the word and its number of occurrences to the result.
            result += String.format("%-15s",maxKey+":") + String.format("%-10s",count) + "\n";
            //Remove the word so it does not get counted again.
            map.remove(maxKey);
        }
        return result;
    }
}
