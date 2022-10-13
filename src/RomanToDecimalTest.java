import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14); //valid
        assertEquals(RomanToDecimal.romanToDecimal("hi felicia"), -1); //invalid
        assertEquals(RomanToDecimal.romanToDecimal("IVIVIV"), 16); //logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("MXMX"), 2020); //logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("CMCMCM"), 3100); //logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("DODO"), -1); //invalid
        assertEquals(RomanToDecimal.romanToDecimal("ICIC"), 202); //logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("MLC"), 1150); // valid
        assertEquals(RomanToDecimal.romanToDecimal(""), 0); //valid
        assertEquals(RomanToDecimal.romanToDecimal("LMCM"), 1950); //valid
        assertEquals(RomanToDecimal.romanToDecimal("XXXX"), 40); //valid
        assertEquals(RomanToDecimal.romanToDecimal("bye felicia"), -1); //invalid
        assertEquals(RomanToDecimal.romanToDecimal("CVIX"),114 ); //valid
        assertEquals(RomanToDecimal.romanToDecimal("LVI"), 56); //valid
        assertEquals(RomanToDecimal.romanToDecimal("SKLMO"), -1); //invalid
        assertEquals(RomanToDecimal.romanToDecimal("IMCLXV"), 966); //valid

        assertNotEquals(RomanToDecimal.romanToDecimal("HELLO WORLD"), 100);
        assertNotEquals(RomanToDecimal.romanToDecimal("CDXI"), 123);
        assertNotEquals(RomanToDecimal.romanToDecimal("MMXXII"), 1983);
    }
}