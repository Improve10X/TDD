package LessThan100;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LessThan100Test {
    LessThan100 lessThan100 = new LessThan100();
 @Test
    public void empty() {}

    @Test
    public void checkEmpty() {
     Boolean number = lessThan100.checkNumbers(2,3);
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
