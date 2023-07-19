package mintohours;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MinutesToSecondsTest {
    private MinutesToSeconds minutesToSeconds;

    @BeforeEach
    public void setup() {
        minutesToSeconds = new MinutesToSeconds();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenZero_returnZero() {
        int zero = minutesToSeconds.findSeconds(0);
        assertEquals(0, zero);
    }

    @Test
    public void givenNegativeOne_returnNegativeOne() {
        int minusOne = minutesToSeconds.findSeconds(-1);
        assertEquals(-60, minusOne);
    }

    @Test
    public void givenSeven_returnFourHundredAndTwenty() {
        int seven = minutesToSeconds.findSeconds(7);
        assertEquals(420, seven);
    }

    @Test
    public void givenThree_returnOneEighty() {
        int three = minutesToSeconds.findSeconds(3);
        assertEquals(180, three);
    }

    @Test
    public void givenHundred_returnOneTwenty() {
        int hundred = minutesToSeconds.findSeconds(100);
        assertEquals(6000,hundred);
    }
}

