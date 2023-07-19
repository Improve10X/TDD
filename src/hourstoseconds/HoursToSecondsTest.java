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
}



