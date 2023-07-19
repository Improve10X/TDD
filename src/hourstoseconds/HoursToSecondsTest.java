package hourstoseconds;

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
    public void givenZero_returnZero() {
        int time =hourToSeconds.findSeconds(0,0);
        assertEquals(0,time);
    }

    @Test
    public void givenMinus1_returnMinus() {
        int time =hourToSeconds.findSeconds(-1,-1);
        assertEquals(-3660,time);
    }

    @Test
    public void givenTwoHoursAndThreeMinutes_return7380Seconds() {
        int time = hourToSeconds.findSeconds(2, 3);
        assertEquals(7380, time);
    }

    @Test
    public void givenFiveHoursAndFiveMinutes_return18300Seconds() {
        int time = hourToSeconds.findSeconds(5, 5);
        assertEquals(18300, time);
    }

    @Test
    public void given100HoursAndMinusZeroMinutes_return359400Seconds() {
        int time = hourToSeconds.findSeconds(100, -10);
        assertEquals(359400, time);
    }
}



