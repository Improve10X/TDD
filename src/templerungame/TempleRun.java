package templerungame;

import java.util.Random;

public class TempleRun {
    public static void main(String[] args) throws Exception {
        startGame();
    }

    private static void startGame() throws Exception {
        Player player = new Player("Siva", 100);
        int[] coinValue = {10, 20, 30, 40, 50};
        boolean isGameRunning = true;
        Random random = new Random();
        System.out.println("Welcome To Game");
        while (isGameRunning) {
            player.run();
            int obstacleType = random.nextInt(3);
            if (obstacleType == 1) {
                Fireball fireball = new Fireball(random.nextInt(10));
                fireball.roll();
                fireball.collide(player);
            } else if (obstacleType == 2) {
                SpikePit spikePit = new SpikePit(random.nextInt(20));
                spikePit.trap();
            } else {
                int randomIndexValue = random.nextInt(coinValue.length);
                Coin coin = new Coin(coinValue[randomIndexValue]);
                System.out.println(player.getName() + " collection " + coinValue[randomIndexValue] + " coins!");
                player.collectCoin(coin);
            }
            if (player.getHealth() <= 0) {
                System.out.println(player.getName() + "Game is over! your final score is : " + player.getScore());
                isGameRunning = false;
            }
            Thread.sleep(1000);
        }
    }
}
