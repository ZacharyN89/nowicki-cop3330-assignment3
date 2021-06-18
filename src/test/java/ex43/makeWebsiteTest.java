/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Zachary Nowicki
*/

package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class makeWebsiteTest {

    //Beware! This also makes the website.
    @Test
    void makeHTML() {
        makeWebsite builder = new makeWebsite();
        builder.setFiles("awesomeco","Max Power");
        boolean js = false;
        boolean css = false;
        builder.makeDirectories(js,css);
        assertEquals("Created ./website/awesomeco/index.html",builder.makeHTML());
    }
}