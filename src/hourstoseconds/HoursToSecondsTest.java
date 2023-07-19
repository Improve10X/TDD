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
}



