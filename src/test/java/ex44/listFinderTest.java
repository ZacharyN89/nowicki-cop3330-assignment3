package ex44;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class listFinderTest {

    @Test
    void parseJSON() {
        listFinder test = new listFinder();
        assertEquals("Success!",test.parseJSON());
    }

    @Test
    void findProductIndex() {
        listFinder test = new listFinder();
        test.parseJSON();

        ArrayList<String> result = test.findProductIndex("Doodad");

        assertEquals("10",result.get(2));
    }
}