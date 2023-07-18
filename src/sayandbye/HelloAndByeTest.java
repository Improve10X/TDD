package sayandbye;


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
}
