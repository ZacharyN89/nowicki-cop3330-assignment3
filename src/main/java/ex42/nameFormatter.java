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
            //Use splitLine to get the firstname, lastname, and salary.
            line = splitLine(list.get(i));

            //Properly format all values.
            first = String.format("%-10s",line[0]);
            last = String.format("%-10s",line[1]);;
            salary = String.format("%-10s",line[2]);;

            //Add the formatted line to the table.
            result += last + first + salary + "\n";
        }
        //Return the table.
        return result;
    }

    public String[] splitLine(String nameLine){
        //Split the line at ',' and return a set that includes the Firstname, Lastname, and Salary.
        String[] result = nameLine.split(",",3);
        return result;
    }
}
