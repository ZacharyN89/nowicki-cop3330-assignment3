/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki
*/

package ex41;

import java.util.ArrayList;

public class nameFormatter {
    public String makeTable (ArrayList<String> list){
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
