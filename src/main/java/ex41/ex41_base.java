/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki


Exercise 41 - Name Sorter

Alphabetizing the contents of a file, or sorting its contents, is a great way to get comfortable manipulating a file in your program.

Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts the list alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong

Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.
Example Output

Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina

Constraint

    Don't hard-code the number of names.

Challenges

    Implement this program by reading in the names from the user, one at a time, and printing out the sorted results to a file.
    Use the program to sort data from a large data set (e.g. census data) and use a profiler to analyze its performance.
*/

package ex41;

import java.util.ArrayList;

public class ex41_base {
    public static void main(String[] args){
        //Use the fileReader to get a list of names.
        fileReader input = new fileReader();
        input.makeFileReader();
        input.readFile();
        ArrayList<String> names = input.getList();

        //Use nameFormatter to format the names.
        nameFormatter tableMaker = new nameFormatter();
        tableMaker.setNames(names);
        tableMaker.sortNames();
        String result = tableMaker.makeTable();

        //Print the result.
        System.out.print(result);
    }
}
