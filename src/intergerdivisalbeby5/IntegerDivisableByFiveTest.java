package intergerdivisalbeby5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class IntegerDivisableByFiveTest {
    private IntegerDivisableByFive intergerDivisibleByFive;

    @BeforeEach
    public void setup() {
        intergerDivisibleByFive = new IntegerDivisableByFive();
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
    public void givenMinus1_returnFalse() {
        boolean zero = intergerDivisibleByFive.find(-1);
        assertEquals(false, zero);
    }

    @Test
    public void givenFive_returnTrue() {
        boolean five = intergerDivisibleByFive.find(5);
        assertEquals(true, five);
    }

    @Test
    public void givenFifteen_returnTrue() {
        boolean five = intergerDivisibleByFive.find(15);
        assertEquals(true, five);
    }

    @Test
    public void givenThree_returnFalse() {
        boolean five = intergerDivisibleByFive.find(3);
        assertEquals(false, five);
    }

    @Test
    public void givenNintynine_returnFalse() {
        boolean five = intergerDivisibleByFive.find(99);
        assertEquals(false, five);
    }
}
