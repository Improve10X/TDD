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

    //bomb("There is a bomb.") ➞ "DUCK!"
    @Test
    public void givenThereIsABomb_returnDUCK() {
        String text = theBomb.CheckWord("there is bomb ");
        assertEquals("DUCK!", text);
    }

    //bomb("Hey, did you think there is a BOMB?") ➞ "DUCK!"
    @Test
    public void givenText_returnDUCKWithExclamationMark() {
        String text = theBomb.CheckWord("BOMB in my home");
        assertEquals("DUCK!", text);
    }

    //bomb("This goes boom!!!") ➞ "Relax, there's no bomb."
    @Test
    public void givenText_returnRelax() {
        String text = theBomb.CheckWord("Holiday goes on");
        assertEquals("Relax, there's no bomb.", text);
    }
}
