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
    public void givenA_returnA() {
        Boolean text = endsWith.findSuffix("a", "a");
        assertEquals(true, text);
    }

    @Test
    public void givenAB_returnAB() {
        Boolean text = endsWith.findSuffix("ab", "b");
        assertEquals(true, text);
    }
}

