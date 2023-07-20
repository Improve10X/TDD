package lessthan100;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LessThan100Test {
    LessThan100 lessThan100 = new LessThan100();
 @Test
    public void empty() {}


    @Test
    public void givenMinus1AndMinus1_returnTrue() {
        Boolean number = lessThan100.checkNumbers(-1,-1);
        assertEquals(true ,number);
    }
    @Test
    public void givenZeroAndZero_returnTrue() {
        Boolean number = lessThan100.checkNumbers(0,0);
        assertEquals(true ,number);
    }

    @Test
    public void givenThreeAndZero_returnTrue() {
        Boolean number = lessThan100.checkNumbers(3,0);
        assertEquals(true ,number);
    }

    @Test
    public void checkNumber() {
        Boolean number = lessThan100.checkNumbers(100,300);
        assertEquals(false ,number);
    }

    @Test
    public void setLessThan100() {
        Boolean number = lessThan100.checkNumbers(99,1);
        assertEquals(false ,number);
    }
}
