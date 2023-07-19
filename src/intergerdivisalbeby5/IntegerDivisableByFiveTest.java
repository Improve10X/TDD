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
        assertEquals(false, zero);
    }

    @Test
    public void givenMinus1_returnFalse() {
        boolean zero = intergerDivisibleByFive.find(-1);
        assertEquals(false, zero);
    }
}
