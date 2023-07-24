package templerungame;

public class Fireball {
    public Fireball(int speed) {
        throw new InvalidFireBallSpeedException();
    }

    public class InvalidFireBallSpeedException extends RuntimeException {
    }
}
