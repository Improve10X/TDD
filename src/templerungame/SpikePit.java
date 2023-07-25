package templerungame;

public class SpikePit extends Obstacle {
    private int width;
    private int damage;

    public SpikePit(int width) throws InvalidObstacleDamageException {
        super("SpikePit", 10);
        if (width < 0 || width > 20) {
            throw new InvalidSpikePitException();
        }
        this.width = width;
    }


    public void trap() {
        System.out.println("SpikePit is trapped with " + width + " meters width!");
    }

    public class InvalidSpikePitException extends RuntimeException {
    }
}
