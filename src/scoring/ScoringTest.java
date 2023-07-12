package scoring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ScoringTest {

    private Scoring scoring  = new Scoring();

//    @BeforeEach
//    public void setUp() {
//        scoring = new Scoring();
//    }

    @Test
    public void empty() {
    }

    @Test
    public void givenNull_returnAllZeros() {
        int[] allZero = scoring.calucateScore(null);
        assertArrayEquals(new int[3], allZero);
    }

    @Test
    public void givenEmptyNull_returnAllZeros() {
        int[] emptyNull = scoring.calucateScore("");
        assertArrayEquals(new int[3], emptyNull);
    }
    @Test
    public void givenA_returnOneZeroZero() {
        int[] givenA = scoring.calucateScore("A");
        assertArrayEquals(new int[]{1, 0, 0}, givenA);
    }
    @Test
    public void givenB_returnZeroOneZero() {
        int[] givenB = scoring.calucateScore("B");
        assertArrayEquals(new int[]{0, 1, 0}, givenB);
    }

    @Test
    public void givenC_returnZeroZeroOne() {
        int[] givenC = scoring.calucateScore("C");
        assertArrayEquals(new int[]{0, 0, 1}, givenC);
    }

    @Test
    public void givenABC_returnOneOneOne() {
        int[] givenABC = scoring.calucateScore("ABC");
        assertArrayEquals(new int[]{1, 1, 1}, givenABC);
    }

    @Test
    public void givenAABBCC_returnTwoTwoTwo() {
        int[] givenAABBCC = scoring.calucateScore("AABBCC");
        assertArrayEquals(new int[]{2, 2, 2}, givenAABBCC);
    }

    @Test
    public void givenABBC_returnOneTwoOne() {
        int[] givenABBC = scoring.calucateScore("ABBC");
        assertArrayEquals(new int[]{1, 2, 1}, givenABBC);
    }
}

