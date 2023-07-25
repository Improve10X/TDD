package templerungame;

public class Coin extends Obstacle {

    public int value;

    public Coin(int value) throws InvalidObstacleDamageException {
        super("Coin",0);
        if (value < 0 || value > 100) {
            throw new InvalidCoinValueException();
        } else {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }

    public class InvalidCoinValueException extends RuntimeException {
    }
}
