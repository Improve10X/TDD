package twomakesten;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TwoMakesTenTest {
    private TwoMakesTen twoMakesTen;

    @BeforeEach
    public void setup() {
        twoMakesTen = new TwoMakesTen();
    }

    @Test
    public void empty() {

    }

    @Test
    public void giveMinus10_returnFalse() {
        boolean nineAndTen = twoMakesTen.makesTen(-10, -10);
        assertEquals(false, nineAndTen);
    }

    
}

