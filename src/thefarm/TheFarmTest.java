package thefarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TheFarmTest {
    private TheFarm theFarm;

    @BeforeEach
    public void setup() {
        theFarm = new TheFarm();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNoOfAnimalsLegsMinus3_returnsTotalAnimalsLegsMinus10 () {
        int animalLegs = theFarm.findAnimalLegs(-1, -1,-1);
        assertEquals(-10, animalLegs);
    }

    @Test
    public void givenNoOfAnimalsLegsMinus40_returnsTotalAnimalsLegsMinus140() {
        int animalLegs = theFarm.findAnimalLegs(-10, -20,-10);
        assertEquals(-140, animalLegs);
    }

    @Test
    public void givenNoOfAnimalsLegsEmpty_returnsTotalAnimalsLegsEmpty() {
        int animalLegs = theFarm.findAnimalLegs(0, 0, 0);
        assertEquals(0, animalLegs);
    }

    @Test
    public void givenOneANdOneAndOneAnimals_returnsTotalAnimalLegsTen() {
        int animalLegs = theFarm.findAnimalLegs(1, 1, 1);
        assertEquals(10, animalLegs);
    }

    @Test
    public void givenTenANdTenAndTenAnimals_returnsTotalAnimalLegsHundred() {
        int animalLegs = theFarm.findAnimalLegs(10 ,10, 10);
        assertEquals(100, animalLegs);
    }

    @Test
    public void givenTwoANdThreeAndFiveAnimals_returnsTotalAnimalLegsTwentyTwo() {
        int animalLegs = theFarm.findAnimalLegs(20, 2, 12);
        assertEquals(96, animalLegs);
    }

    @Test
    public void givenFiveANdTwoAndEightAnimals_returnsTotalAnimalLegsFifty() {
        int animalLegs = theFarm.findAnimalLegs(68, 38, 8);
        assertEquals(320, animalLegs);
    }

    @Test
    public void givenHundredANdHundredAndHundredAnimals_returnsTotalAnimalLegsThousand() {
        int animalLegs = theFarm.findAnimalLegs(100, 100, 100);
        assertEquals(1000, animalLegs);
    }
}
