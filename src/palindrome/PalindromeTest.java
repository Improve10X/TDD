package palindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {
    private Palindrome palindrome;
    @BeforeEach
    public void setup(){
        palindrome = new Palindrome();
    }
    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnFalse() {
        boolean text = palindrome.findPalindrome(null);
        assertEquals(false, text);
    }

    @Test
    public void givenNull_returnTrue() {
        boolean text = palindrome.findPalindrome("");
        assertEquals(true, text);
    }

    @Test
    public void givenS_returnTrue() {
        boolean text = palindrome.findPalindrome("S");
        assertEquals(true, text);
    }

    @Test
    public void givenSK_returnTrue() {
        boolean text = palindrome.findPalindrome("SK");
        assertEquals(false, text);
    }

    @Test
    public void givenSS_returnTrue() {
        boolean text = palindrome.findPalindrome("SS");
        assertEquals(true, text);
    }

    @Test
    public void givenLevel_returnTrue() {
        boolean text = palindrome.findPalindrome("level");
        assertEquals(true, text);
    }

    @Test
    public void givenNotAPalindrome_returnFalse() {
        boolean text = palindrome.findPalindrome("Not a Palindrome");
        assertEquals(false, text);
    }
}
