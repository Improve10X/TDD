package encryption;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class EncryptionTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnsaca() {
        Encryption encryption =  new Encryption();
        String result = encryption.getEncryption(null);
        assertEquals("aca", result);

    }

    @Test
    public void givenEmpty_returnsaca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("");
        assertEquals("aca", result);

    }

    @Test
    public void givenb_returnsbaca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("b");
        assertEquals("baca", result);

    }

    @Test
    public void givenc_returnscaca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("c");
        assertEquals("caca", result);

    }

    @Test
    public void givenf_returnsfaca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("f");
        assertEquals("faca", result);

    }

    @Test
    public void givenz_returnszaca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("z");
        assertEquals("zaca", result);

    }

    @Test
    public void givena_returns0aca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("a");
        assertEquals("0aca", result);
    }

    @Test
    public void givene_returns1aca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("e");
        assertEquals("1aca", result);
    }

    @Test
    public void giveni_returns2aca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("i");
        assertEquals("2aca", result);
    }

    @Test
    public void giveno_returns2aca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("2");
        assertEquals("2aca", result);
    }

    @Test
    public void givenu_returns4aca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("u");
        assertEquals("4aca", result);
    }

    @Test
    public void givencb_returnsbcaca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("cb");
        assertEquals("bcaca", result);
    }

    @Test
    public void givenmn_returnsnmaca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("mn");
        assertEquals("nmaca", result);
    }

    @Test
    public void givenab_returnb0aca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("ab");
        assertEquals("b0aca", result);
    }

    @Test
    public void givebanana_returns0n0n0baca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("banana");
        assertEquals("0n0n0baca", result);
    }

    @Test
    public void givenapple_return1lpp0aca() {
        Encryption encryption = new Encryption();
        String result = encryption.getEncryption("apple");
        assertEquals("1lpp0aca", result);
    }
}
