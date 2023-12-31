package templerungame;

public class Fireball extends Obstacle {
    public int speed;
    public Fireball(int speed) throws InvalidObstacleDamageException {
        super("Fireball",20);
        if(speed < 0 || speed > 100){
            throw new InvalidFireBallSpeedException();
        }
        this.speed = speed;
    }

    public void roll() {
        System.out.println("Fire ball is rolling with " + speed + " Km's Speed" );
    }

    public class InvalidFireBallSpeedException extends RuntimeException {
    }
}
