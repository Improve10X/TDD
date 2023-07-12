package FizzBuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void empty(){
    }

    @Test
    public void checkEmpty() {
        String zero = fizzBuzz.findFizzBuzz(1);
        assertEquals(zero,zero);
    }

    @Test
    public void checkFive_returnBuzz() {
        String five = fizzBuzz.findFizzBuzz(5);
        assertEquals("Buzz",five);
    }

    @Test
    public void checkTwo_returnTwo() {
        String two = fizzBuzz.findFizzBuzz(2);
        assertEquals(two,two);
    }

    @Test
    public void checkNine_returnFizz() {
        String nine = fizzBuzz.findFizzBuzz(9);
        assertEquals("Fizz",nine);
    }

    @Test
    public void checkNine_returnNine() {
        String nine = fizzBuzz.findFizzBuzz(9);
        assertEquals("Fizz",nine);
    }

    @Test
    public void checkFifteen_returnFizzBuzz() {
        String Fifteen = fizzBuzz.findFizzBuzz(15);
        assertEquals("FizzBuzz",Fifteen);
    }

    @Test
    public void checkHundred_returnFizzBuzz() {
        String Hundred = fizzBuzz.findFizzBuzz(100);
        assertEquals("Buzz",Hundred);
    }
}
