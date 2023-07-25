package templerungame;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ObstacleTest {
    @Test
    public void nothing() {
    }

    @Test
    public void givenNameNull_whenGetNameCalled_thenReturnEmpty() throws Obstacle.InvalidObstacleDamageException {
        Obstacle obstacle = new Obstacle(null, 10);
        assertEquals("", obstacle.getName());
    }

    @Test
    public void givenNameEmpty_whenGetNameCalled_thenReturnEmpty() throws Obstacle.InvalidObstacleDamageException {
        Obstacle obstacle = new Obstacle("", 20);
        assertEquals("", obstacle.getName());
    }

    @Test
    public void givenNameFire_whenGetNameCalled_thenReturnFire() throws Obstacle.InvalidObstacleDamageException {
        Obstacle obstacle = new Obstacle("Fire", 20);
        assertEquals("Fire", obstacle.getName());
    }

    @Test
    public void givenNameFireWithSpaces_whenGetNameCalled_thenReturnFire() throws Obstacle.InvalidObstacleDamageException {
        Obstacle obstacle = new Obstacle(" Fire  ", 20);
        assertEquals("Fire", obstacle.getName());
    }

    @Test
    public void givenDamageMinusHundred_thenThrowsInvalidObstacleDamageException() {
        assertThrows(Obstacle.InvalidObstacleDamageException.class, () -> new Obstacle("SIVA", -100),
                "Obstacle damage should be 0 to 100");
    }

    @Test
    public void givenDamage101_thenThrowsInvalidObstacleDamageException() {
        assertThrows(Obstacle.InvalidObstacleDamageException.class, () -> new Obstacle("SIVA", 101),
                "Obstacle damage should be 0 to 100");
    }

    @Test
    public void givenDamage10_whenGetDamageCalled_thenReturn10() throws Obstacle.InvalidObstacleDamageException {
        Obstacle obstacle = new Obstacle("Siva", 10);
        assertEquals(10, obstacle.getDamage());
    }

    @Test
    public void whenCollideCalled_thenDecreaseHealth() throws Obstacle.InvalidObstacleDamageException,
            Player.InvalidHealthException {
        Obstacle obstacle = new Obstacle("Fireball", 10);
        Player player = new Player("Name");
        obstacle.collide(player);
        assertEquals(90, player.getHealth());
    }
}
