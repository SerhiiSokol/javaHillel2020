import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Game game = new Game();
        System.out.println();
        System.out.println("Добро пожаловать в игру \"ROCK, PAPER, SCISSORS\"");
        Thread.sleep(2000);
        game.start();

    }

}
