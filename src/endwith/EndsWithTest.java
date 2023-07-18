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
    public void givenAbc_returnTrue() {
        Boolean text = endsWith.findSuffix("abc", "bc");
        assertEquals(true, text);
    }

    @Test
    public void givenNull_returnNUll() {
        Boolean text = endsWith.findSuffix("","");
        assertEquals(true, text);
    }
}
