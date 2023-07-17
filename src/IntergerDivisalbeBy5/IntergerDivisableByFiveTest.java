package IntergerDivisalbeBy5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class IntergerDivisableByFiveTest {
    private IntergerDivisableByFive intergerDivisibleByFive;

    @BeforeEach
    public void setup() {
        intergerDivisibleByFive = new IntergerDivisableByFive();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenZero_returnTrue() {
        boolean zero = intergerDivisibleByFive.find(0);
        assertEquals(true, zero);
    }

    @Test
    public void givenMinusOne_returnFalse() {
        boolean minusOne = intergerDivisibleByFive.find(-1);
        assertEquals(false, minusOne);
    }

    @Test
    public void givenFive_returnTrue() {
        boolean five = intergerDivisibleByFive.find(5);
        assertEquals(true, five);
    }
}
