import java.io.IOException;

public class Main {

    public static void main(String[] args){

        Game game = new Game();
        System.out.println();
        System.out.println("Добро пожаловать в игру \"ROCK, PAPER, SCISSORS\"");

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        game.start();

    }

}
