/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki
*/

package ex41;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class fileReaderTest {

    @Test
    void readLine() {
        fileReader test = new fileReader();
        test.makeFileReader();
        assertEquals("Ling, Mai",test.readFileLine());
    }

    @Test
    void makeFileReader() {
        //If it does not throw an exception that means it grabbed the correct file.
        fileReader test = new fileReader();
        try {
            test.makeFileReader();
            assertTrue(true);
        }catch(Exception ex){
            fail();
        }
    }

    @Test
    void getList() {
        //If it can grab the last item in the list correctly then it was made correctly.
        fileReader test = new fileReader();
        test.makeFileReader();
        test.readFile();
        assertEquals("Xiong, Fong", test.getList().get(6));
    }
}