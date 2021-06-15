/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki
*/

package ex42;

import java.util.ArrayList;

public class nameFormatter {
    public String makeTable (ArrayList<String> list){
        //Create start of table.
        String result = "Last      "+"First     "+"Salary\n"+
                        "--------------------------\n";

        String[] line;
        String first;
        String last;
        String salary;
        //Loop through list and add all names.
        for(int i=0; i<list.size(); i++) {
            line = splitLine(list.get(i));

            first = String.format("%-10s",line[0]);
            last = String.format("%-10s",line[1]);;
            salary = String.format("%-10s",line[2]);;

            result += last + first + salary + "\n";
        }
        return result;
    }

    public String[] splitLine(String nameLine){
        String[] result = nameLine.split(",",3);
        return result;
    }
}
