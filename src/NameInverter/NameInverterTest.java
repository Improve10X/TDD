package NameInverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;

public class NameInverterTest {
    NameInverter nameInverter;

    @BeforeEach
    public void setUp() {
        nameInverter = new NameInverter();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void emptyString() {
        String inverterName = nameInverter.inverterName("");
        assertEquals("", inverterName);
    }

    @Test
    public void givenOne_returnOne() {
        String givenOne = nameInverter.inverterName("one");
        assertEquals("one", givenOne);
    }

    @Test
    public void givenWordSpace_returnWordSpace() {
        String WordSpace = nameInverter.inverterName("name  ");
        assertEquals("name", WordSpace);
    }

    @Test
    public void givenWordSpaceBeginning_returnWordSpace() {
        String SpaceBeginning = nameInverter.inverterName("    name  ");
        assertEquals("name", SpaceBeginning);
    }

    @Test
    public void givenFirstLast_returnInvertedName() {
        String FirstLast = nameInverter.inverterName("Siva kumar");
        assertEquals("kumar, Siva", FirstLast);
    }

    @Test
    public void givenHonorifics_ignoreHonorifics() {
        String honorifics = nameInverter.inverterName("Mrs. first last");
        assertEquals("last, first", honorifics);
    }

    @Test
    public void givenPostNominals_ignorePostNominals() {
        String PostNominals = nameInverter.inverterName("first last Msc.");
        assertEquals("last, first Msc.", PostNominals);
    }

    @Test
    public void givenMultiPostNominals_ignoreMultiPostNominals() {
        String PostMultiNominals = nameInverter.inverterName("first last Msc. PhD");
        assertEquals("last, first Msc. PhD", PostMultiNominals);
    }

    @Test
    public void intergrationTest() {
        String test = nameInverter.inverterName("Mr. siva kumar MTech");
        assertEquals("kumar, siva MTech", test);
    }
}

