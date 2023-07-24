package templerungame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class FireballTest {
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setup() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void givenMinusOne_throwsInvalidFireBallSpeedException() {
        assertThrows(Fireball.InvalidFireBallSpeedException.class,
                () -> new Fireball(-1),
                "Fireball speed should be between 0 to 100");
    }

}
