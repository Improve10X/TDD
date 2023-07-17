package AgeToDays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AgeToDaysTest {
    private AgeToDays ageToDays;
    @BeforeEach
    public void setup(){
        ageToDays = new AgeToDays();
    }
    @Test
    public  void nothing(){

    }

    @Test
    public void given23Age_return8395Days(){
        int age = ageToDays.convertAgeToDays(23);
        assertEquals(8395,age);
    }

    @Test
    public void givenZeroAge_returnZeroDays(){
        int ageZero = ageToDays.convertAgeToDays(0);
        assertEquals(0,ageZero);
    }

    @Test
    public void given100Age_return36500Days(){
        int age = ageToDays.convertAgeToDays(100);
        assertEquals(36500,age);
}
}

