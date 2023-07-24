package helloandbye;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HelloAndByeTest {

    HelloAndBye helloAndBye;

    @BeforeEach
    public void setUp() {
        helloAndBye = new HelloAndBye();
    }

    @Test
    public void givenNothing() {

    }

    @Test
    public void givenNull_returnNull() {
        String test = helloAndBye.checkWord(null,0);
        assertEquals(null,test);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        String test = helloAndBye.checkWord("",0);
        assertEquals("",test);
    }

    public void givenMinus1_returnInvalidText() {
        String test = helloAndBye.checkWord("Siva", -1);
        assertEquals("Invalid Text", test);
    }

    @Test
    public void givenOne_returnByeHelloSiva() {
        String test = helloAndBye.checkWord("Siva", 1);
        assertEquals("Hello Siva", test);
    }

    @Test
    public void givenZero_returnByeSiva() {
        String test = helloAndBye.checkWord("Siva", 0);
        assertEquals("Bye Siva", test);
    }

    @Test
    public void givenSiva_returnInvalidText() {
        String test = helloAndBye.checkWord("Siva", 7);
        assertEquals("Invalid Text", test);
    }
}
