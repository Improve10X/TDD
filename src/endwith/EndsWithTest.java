package endwith;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class EndsWithTest {
    private EndsWith endsWith;

    @BeforeEach
    public void setup() {
        endsWith = new EndsWith();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenEmptyNull_returnNull() {
        Boolean text = endsWith.findSuffix(null, null);
        assertEquals(false, text);
    }

    @Test
    public void givenEmpty_returnEmpty() {
        Boolean text = endsWith.findSuffix("", "");
        assertEquals(true, text);
    }

    @Test
    public void givenA_returnTrue() {
        Boolean text = endsWith.findSuffix("a", "a");
        assertEquals(true, text);
    }

    @Test
    public void givenAB_returnTrue() {
        Boolean text = endsWith.findSuffix("ab", "b");
        assertEquals(true, text);
    }

    @Test
    public void givenABCAndD_returnFalse() {
        Boolean text = endsWith.findSuffix("abc", "d");
        assertEquals(false, text);
    }

    @Test
    public void givenDADAndD_returnTrue() {
        Boolean text = endsWith.findSuffix("Dad", "d");
        assertEquals(true, text);
    }
}

