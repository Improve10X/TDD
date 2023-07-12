package Fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void nothing() {

    }
    @Test
    public void givenAnyNegative_returnNegativeOne(){
        Fibonacci fibonacci = new Fibonacci();
        int negativeNumber = fibonacci.find(-10);
        assertEquals(-1 ,negativeNumber);
    }
}
