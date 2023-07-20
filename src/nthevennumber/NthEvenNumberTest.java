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
    public void givenEvenNumberZero_returnEvenNumberIsZero() {
        int evenNumber = nthEvenNumber.findEvenNumber(0);
        assertEquals(0, evenNumber);
    }

}
