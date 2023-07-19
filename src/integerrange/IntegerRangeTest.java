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
        boolean oneAndThreeAndNine = integerRange.findRange(1, -1, -10);
        assertEquals(false, oneAndThreeAndNine);
    }

}

