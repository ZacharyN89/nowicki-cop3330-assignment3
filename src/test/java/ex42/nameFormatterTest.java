/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki
*/

package ex42;

import ex41.fileReader;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class nameFormatterTest {

    @Test
    void splitLine() {
        //Instantiate class.
        ex42.nameFormatter test = new nameFormatter();

        //Split the lne.
        String[] result = test.splitLine("Ling,Mai,55900");

        //If the result of the first index is the correct firstname then splitLine works correctly.
        assertEquals("Ling",result[0]);
    }
}