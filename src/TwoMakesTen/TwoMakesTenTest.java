package TwoMakesTen;

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
    public void giveNineAndTen_returnTrue() {
        boolean nineAndTen = twoMakesTen.makesTen(9, 10);
        assertEquals(true, nineAndTen);
    }

    @Test
    public void giveNineAndNine_returnFalse() {
        boolean nineAndNine = twoMakesTen.makesTen(9, 9);
        assertEquals(false, nineAndNine);
    }

    @Test
    public void giveOneAndNine_returnTrue() {
        boolean oneAndNine = twoMakesTen.makesTen(1, 9);
        assertEquals(true, oneAndNine);
    }
}

