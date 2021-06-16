/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki
*/

package ex46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class countWordsTest {

    @Test
    void parseFile() {
        countWords test = new countWords();
        String result = test.parseFile();
        assertNotEquals("Cannot find file.",result);
    }

    @Test
    void removeLineBreaks() {
        countWords test = new countWords();
        String result = test.removeLineBreaks("How\nis your\nday. ");
        assertEquals("How is your day. ",result);
    }

    @Test
    void makeList() {
        countWords test = new countWords();
        String result = test.parseFile();
        result = test.removeLineBreaks(result);
        ArrayList<String> words = test.makeList(result);
        assertEquals("badger",words.get(0));
    }

    @Test
    void countWords_1(){
        countWords test = new countWords();
        ArrayList<String> words = new ArrayList<String>();
        words.add("badger");
        words.add("badger");
        words.add("badger");
        words.add("clown");

        Map<String,Integer> result = test.countWords(words);
        assertEquals(3,result.get("badger"));
    }

    @Test
    void countWords_2(){
        countWords test = new countWords();
        ArrayList<String> words = new ArrayList<String>();
        words.add("badger");
        words.add("badger");
        words.add("badger");
        words.add("clown");

        Map<String,Integer> result = test.countWords(words);
        assertEquals(1,result.get("clown"));
    }

    @Test
    void makeChart() {
        countWords test = new countWords();
        Map<String,Integer> run = new HashMap<String,Integer>();
        run.put("badger",3);

        assertEquals("badger:        ***       \n",test.makeChart(run));
    }
}