package templerungame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void given101_throwsInvalidFireBallSpeedException() {
        assertThrows(Fireball.InvalidFireBallSpeedException.class,
                () -> new Fireball(101),
                "Fireball speed should be between 0 to 100");
    }


    @Test
    public void given10_whenRollMethodCalled_displayRollingMessage() throws Obstacle.InvalidObstacleDamageException {
        Fireball fireBall = new Fireball(10);
        fireBall.roll();
        assertEquals("Fire ball is rolling with " + 10 + " Km's Speed", outputStream.toString().trim());
    }

        @Test
    public void given100_whenRollMethodCalled_displayRollingMessage() throws Obstacle.InvalidObstacleDamageException {
        Fireball fireBall = new Fireball(100);
        fireBall.roll();
        assertEquals("Fire ball is rolling with " + 100 + " Km's Speed", outputStream.toString().trim());
    }
}
