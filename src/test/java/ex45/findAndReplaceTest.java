/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki
*/
package ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findAndReplaceTest {

    @Test
    void getFile(){
        findAndReplace test = new findAndReplace();
        assertNotEquals("Cannot find file.",test.getFile());
    }

    @Test
    void replace_1() {
        findAndReplace test = new findAndReplace();
        assertEquals("use",test.replace("utilize"));
    }

    @Test
    void replace_2() {
        findAndReplace test = new findAndReplace();
        assertNotEquals("utilize",test.replace("utilize"));
    }

    @Test
    void replace_3() {
        findAndReplace test = new findAndReplace();
        assertNotEquals("use",test.replace("test"));
    }
}