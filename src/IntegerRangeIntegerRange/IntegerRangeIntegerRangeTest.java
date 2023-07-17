package IntegerRangeIntegerRange;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class IntegerRangeIntegerRangeTest {
    private IntegerRangeIntegerRange integerRange;

    @BeforeEach
    public void setup() {
        integerRange = new IntegerRangeIntegerRange();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenOneAndThreeAndNine_returnTrue() {
        boolean oneAndThreeAndNine = integerRange.findRange(1, 3, 9);
        assertEquals(true, oneAndThreeAndNine);
    }

    @Test
    public void givenSixAndOneAndSix_returnFalse() {
        boolean sixAndOneAndSix = integerRange.findRange(6, 1, 6);
        assertEquals(false, sixAndOneAndSix);
    }

    @Test
    public void givenThreeAndThreeAndEight_returnTrue() {
        boolean threeAndThreeAndEight = integerRange.findRange(3, 3, 8);
        assertEquals(true, threeAndThreeAndEight);
    }
}

