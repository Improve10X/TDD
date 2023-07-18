package bomb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TheBombTest {
    private TheBomb theBomb;

    @BeforeEach
    public void setUp() {
        theBomb = new TheBomb();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNull_returnNUll() {
        String text = theBomb.checkWord(null);
        assertEquals("null", text);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        String text = theBomb.checkWord("");
        assertEquals("", text);
    }
}
