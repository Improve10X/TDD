package HoursToSeconds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HoursToSecondsTest {

    private HourToSeconds hourToSeconds;

    @BeforeEach
    public void setup() {
        hourToSeconds = new HourToSeconds();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenTwoHoursAndThreeMinutes_return7380Seconds() {
        int twoHoursAndThreeMinutes = hourToSeconds.findSeconds(2, 3);
        assertEquals(7380, twoHoursAndThreeMinutes);
    }

    @Test
    public void givenTwoHoursAndZeroMinutes_return7200Seconds() {
        int twoHoursAndThreeMinutes = hourToSeconds.findSeconds(2, 0);
        assertEquals(7200, twoHoursAndThreeMinutes);
    }

    @Test
    public void givenZeroHoursAndZeroMinutes_return7380Seconds() {
        int twoHoursAndThreeMinutes = hourToSeconds.findSeconds(0, 0);
        assertEquals(0, twoHoursAndThreeMinutes);
    }
}



