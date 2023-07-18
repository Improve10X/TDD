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
    public void givenFive_returnThreeHundred() {
        int five = minutesToSeconds.findSeconds(5);
        assertEquals(300, five);
    }

    @Test
    public void givenThree_returnOneEighty() {
        int three = minutesToSeconds.findSeconds(3);
        assertEquals(180, three);
    }

    @Test
    public void givenTwo_returnOneTwenty() {
        int two = minutesToSeconds.findSeconds(2);
        assertEquals(120,two);
}
}

