package integerrange;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class IntegerRangeTest {
    private IntegerRange integerRange;

    @BeforeEach
    public void setup() {
        integerRange = new IntegerRange();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenOneAndMinusTenAndMinusTen_returnFalse() {
        boolean range = integerRange.findRange(1, -10, -10);
        assertEquals(false, range);
    }

    @Test
    public void givenOneAndMinusOneAndMinusTen_returnTrue() {
        boolean range = integerRange.findRange(1, -1, -10);
        assertEquals(false, range);
    }

    @Test
    public void givenOneAndZeroAndZero_returnFalse() {
        boolean range = integerRange.findRange(1, 0, 0);
        assertEquals(false, range);
    }

    @Test
    public void givenFiveAndThreeAndNine_returnTrue() {
        boolean range = integerRange.findRange(5, 3, 9);
        assertEquals(true, range);
    }

    @Test
    public void givenSixAndOneAndSix_returnFalse() {
        boolean range = integerRange.findRange(6, 1, 6);
        assertEquals(false, range);
    }

    @Test
    public void givenThreeAndThreeAndEight_returnTrue() {
        boolean range = integerRange.findRange(3, 3, 8);
        assertEquals(true, range);
    }

}

