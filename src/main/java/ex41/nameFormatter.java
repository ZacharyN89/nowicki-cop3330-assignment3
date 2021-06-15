/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki
*/

package ex41;

import java.util.ArrayList;
import java.util.Collections;

public class nameFormatter {
    private static ArrayList<String> list = new ArrayList<String>();

    public void setNames(ArrayList<String> input){
        list = input;
    }

    public ArrayList<String> sortNames(){
         Collections.sort(list);
         return list;
    }

    public String makeTable (){
        //Create start of table, including getting the number of names.
        String result = "Total of "+list.size()+" names\n" +
                        "-----------------\n";
        //Loop through list and add all names.
        for(int i=0; i<list.size(); i++) {
            result += list.get(i) + "\n";
        }

        return result;
    }
}
