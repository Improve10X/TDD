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
    public void givenEmpty_returnEmpty() {
        String test = helloAndBye.checkWord("",0);
        assertEquals("",test);

    }

}
