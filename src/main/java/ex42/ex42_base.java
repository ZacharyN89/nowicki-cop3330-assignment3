/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki


Exercise 42 - Parsing a Data File

Sometimes data comes in as a structured format that you have to break down and turn into records so you can process them. CSV, or comma-separated values, is a common standard for doing this.

Construct a program that reads in the following data file (you will need to create this data file yourself; name it `exercise42_input.txt`):

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500

Process the records and display the results formatted as a table, evenly spaced, as shown in the example output.
Example Output

Last      First     Salary
--------------------------
Ling      Mai       55900
Johnson   Jim       56500
Jones     Aaron     46000
Jones     Chris     34500
Swift     Geoffrey  14200
Xiong     Fong      65000
Zarnecki  Sabrina   51500

Constraints

    Write your own code to parse the data. Don't use a CSV parser.

Challenges

    Make each column one space longer than the longest value in the column.
    Format the salary as currency with dollar signs and commas.
    Sort the results by salary from highest to lowest.
    Rework your program to use a CSV parsing library and compare the results.
*/

package ex42;

import java.util.ArrayList;

public class ex42_base {
    public static void main(String[] args) {
        //Use the fileReader to get a list of names.
        fileReader input = new fileReader();
        input.makeFileReader();
        input.readFile();
        ArrayList<String> names = input.getList();

        //Use nameFormatter to format the names into a table.
        nameFormatter tableMaker = new nameFormatter();
        String result = tableMaker.makeTable(names);

        //Print the result.
        System.out.print(result);
    }
}
