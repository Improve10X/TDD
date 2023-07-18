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

    @Test
    public void givenThereIsABomb_returnDUCK() {
        String text = theBomb.checkWord("there is bomb");
        assertEquals("DUCK!", text);
    }

    @Test
    public void givenText_returnDUCKWithExclamationMark() {
        String text = theBomb.checkWord("BOMB in my home");
        assertEquals("DUCK!", text);
    }

    @Test
    public void givenText_returnRelax() {
        String text = theBomb.checkWord("Holiday goes on");
        assertEquals("Relax, there's no bomb.", text);
    }

    @Test
    public void givenAbcd_returnRelax() {
        String text = theBomb.checkWord("abcd bomb");
        assertEquals("DUCK!", text);
    }
}
