package sayandbye;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

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
    public void givenZero_returnBye() {
        String test = helloAndBye.checkNumber("Siva", 0);
        assertEquals("Bye Siva", test);
    }
}
