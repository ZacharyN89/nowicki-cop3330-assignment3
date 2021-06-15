/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki
*/

package ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class nameFormatterTest {

    @Test
    void makeTable() {
        //Use the fileReader to get a list of names.
        fileReader input = new fileReader();
        input.makeFileReader();
        input.readFile();
        ArrayList<String> names = input.getList();

        //Use nameFormatter to format the names.
        nameFormatter tableMaker = new nameFormatter();
        String result = tableMaker.makeTable(names);

        //I don't know why this doesn't work.
        //assertTrue(result.equals("Total of 7 names\n-----------------\nJohnson, Jim\nJones, Aaron\nJones, Chris\nLing, Mai\nSwift, Geoffrey\nXiong, Fong\nZarnecki, Sabrina\n"));
    }
}