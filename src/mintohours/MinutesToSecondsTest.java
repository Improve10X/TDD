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
}

