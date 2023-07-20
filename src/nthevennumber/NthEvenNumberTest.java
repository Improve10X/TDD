package nthevennumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class NthEvenNumberTest {
    private NthEvenNumber nthEvenNumber;

    @BeforeEach
    public void setup() {
        nthEvenNumber = new NthEvenNumber();
    }

    @Test
    public void nothing() {
    }
    @Test
    public void givenEvenNumberIsMinusTen_returnEvenNumberIsMinus22() {
        int evenNumber = nthEvenNumber.findEvenNumber(-10);
        assertEquals(-22, evenNumber);
    }

    @Test
    public void givenEvenNumberZero_returnEvenNumberIsZero() {
        int evenNumber = nthEvenNumber.findEvenNumber(0);
        assertEquals(0, evenNumber);
    }

    @Test
    public void givenEvenNumberIsTwo_returnEvenNumberIsEighteen() {
        int evenNumber = nthEvenNumber.findEvenNumber(2);
        assertEquals(2, evenNumber);
    }
    @Test
    public void givenEvenNumberIsSix_returnEvenNumberIsEight() {
        int evenNumber = nthEvenNumber.findEvenNumber(6);
        assertEquals(10, evenNumber);
    }

    @Test
    public void givenEvenNumberIsSixty_returnEvenNumberIsOneOneEight() {
        int evenNumber = nthEvenNumber.findEvenNumber(60);
        assertEquals(118, evenNumber);
    }

    @Test
    public void givenEvenNumberIsHundred_returnEvenNumberIs() {
        int evenNumber = nthEvenNumber.findEvenNumber(100);
        assertEquals(198, evenNumber);
    }

}
