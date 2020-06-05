import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Game g = new Game();
        System.out.println("Добро пожаловать в игру!");
        System.out.println("Игра называется \"Камень,ножницы,бумага\"");
        g.start();

    }

}
