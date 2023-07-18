package agetodays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AgeToDaysTest {
    private AgeToDays ageToDays;

    @BeforeEach
    public void setup() {
        ageToDays = new AgeToDays();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenMinus10_returnMinus3650ays() {
        int age = ageToDays.convertAgeToDays(-10);
        assertEquals(-3650, age);
    }

    @Test
    public void givenMinus1_returnMinus365Days() {
        int age = ageToDays.convertAgeToDays(-1);
        assertEquals(-365, age);
    }

    @Test
    public void givenZero_returnZeroDays() {
        int age = ageToDays.convertAgeToDays(0);
        assertEquals(0, age);
    }

    @Test
    public void givenOne_returnOneDays() {
        int ageZero = ageToDays.convertAgeToDays(1);
        assertEquals(365, ageZero);
    }

    @Test
    public void given23Age_return8395Days() {
        int age = ageToDays.convertAgeToDays(23);
        assertEquals(8395, age);
    }

    @Test
    public void given100Age_return36500Days() {
        int age = ageToDays.convertAgeToDays(100);
                assertEquals(36500, age);
    }
}

