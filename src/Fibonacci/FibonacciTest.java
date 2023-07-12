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

    @Test
    public void givenZero_returnZero(){
        Fibonacci fibonacci = new Fibonacci();
        int zeroFibonacci = fibonacci.find(0);
        assertEquals(0 ,zeroFibonacci);
    }

    @Test
    public void givenOne_returnOne(){
        Fibonacci fibonacci = new Fibonacci();
        int oneFibonacci = fibonacci.find(1);
        assertEquals(1 ,oneFibonacci);
    }
    @Test
    public void givenTwo_returnTwo(){
        Fibonacci fibonacci = new Fibonacci();
        int twoFibonacci = fibonacci.find(2);
        assertEquals(1 ,twoFibonacci);
    }

    @Test
    public void givenFive_returnFive(){
        Fibonacci fibonacci = new Fibonacci();
        int fiveFibonacci = fibonacci.find(5);
        assertEquals(5 ,fiveFibonacci);
    }
    @Test
    public void givenSeven_returnSeven(){
        Fibonacci fibonacci = new Fibonacci();
        int sevenFibonacci = fibonacci.find(7);
        assertEquals(13 ,sevenFibonacci);
    }
}
