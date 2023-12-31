package greeting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class GreetingTest {
    private Greeting nameGreeting;

    @BeforeEach
    public void setup() {
        nameGreeting = new Greeting();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnNull() {
        String name = nameGreeting.setNameGreeting(null);
        assertEquals( null, name);
    }

    @Test
    public void givenEmptyName_returnEmptyName() {
        String name = nameGreeting.setNameGreeting("");
        assertEquals("", name);
    }

    @Test
    public void givenWordBye_returnhelloByeWithExclamationMark() {
        String name = nameGreeting.setNameGreeting("bye");
        assertEquals("hello bye!", name);
    }

    @Test
    public void givenNameEd_returnHelloEdExclamationMark() {
        String name = nameGreeting.setNameGreeting("siva");
        assertEquals("hello siva!", name);
    }

    @Test
    public void givenNameTiffany_returnHelloTiffanyExclamationMark() {
        String name = nameGreeting.setNameGreeting("hi");
        assertEquals("hello hi!", name);
    }
}
