import java.util.Scanner;

class Game extends Settings {
    int res = 0;
    private int player1Win = 0;
    private int player2Win = 0;
    private int aiWin = 0;

    public void start() {
        Settings sett = new Settings();
        sett.strSettings();
        System.out.println("Начинаем игру!");
        while (gamecaunt != 0) {
            if (!isHuman) {
                Move p1 = Move.getMove(true);
                Move p2 = Move.getMove(false);
                if (p1 == Move.EXIT) {
                    finalRes(player1Win, aiWin);
                    System.out.println("Спасибо за игру!");
                    System.exit(666);
                }
                res = Move.compareMoves(p1, p2);
                if (res == 1) {
                    player1Win += 1;
                }
                if (res == -1) {
                    aiWin += 1;
                }
                System.out.println();
                switch (res) {
                    case 0 -> System.out.println("Ничья!");
                    case 1 -> System.out.println("Победил человек!");
                    case -1 -> System.out.println("Победила машина!");
                }
                System.out.println();
                showRes(player1Win, aiWin);
            } else {
                Move p1 = Move.getMove(true);
                Move p2 = Move.getMove(true);
                if (p1 == Move.EXIT || p2 == Move.EXIT) {
                    finalRes(player1Win, player2Win);
                    System.out.println("Спасибо за игру!");

                    System.exit(666);
                }
                res = Move.compareMoves(p1, p2);
                if (res == 1) {
                    player1Win += 1;
                }
                if (res == -1) {
                    player2Win += 1;
                }
                switch (res) {
                    case 0 -> System.out.println("Ничья!");
                    case 1 -> System.out.println("Первый игрок победил!");
                    case -1 -> System.out.println("Второй игрок победил!");
                }
                showRes(player1Win, player2Win);
            }
            gamecaunt--;
        }
        if (isHuman) {
            System.out.println();
            save(finalRes(player1Win, player2Win));
        }
        if (!isHuman) {
            System.out.println();
            save(finalRes(player1Win, aiWin));
        }
        System.out.println("Желаете повторить игру? 1 - да, 2 - нет");
        Scanner sc = new Scanner(System.in);
        if (sc.nextInt() == 1) {
            start();
        }
        System.out.println("До новых встречь!");
    }

    void showRes(int p1, int p2) {
        if (!isHuman) {
            System.out.println();
            System.out.println("[Игрок [" + p1 + ":" + p2 + "] Компьютер]");
        }
        if (isHuman) {
            System.out.println();
            System.out.println("[Игрок 1 [" + p1 + ":" + p2 + "] Игрок 2]");
        }
    }

    String finalRes(int p1, int p2) {
        String result = "";

        if (!isHuman && p1 > p2) {
            result = "По итогу всех игр победил Игрок!" +
                    "\n[Игрок [" + p1 + ":" + p2 + "] Компьютер]";
            System.out.println(result);
        }
        if (!isHuman && p1 < p2) {
            result = "По итогу всех игр победил Компьютер!" +
                    "\n[Игрок [" + p1 + ":" + p2 + "] Компьютер]";
            System.out.println(result);
        }
        if (!isHuman && p1 == p2) {
            result = "По итогу всех игр - НИЧЬЯ!" +
                    "\n[Игрок [" + p1 + ":" + p2 + "] Компьютер]";
            System.out.println(result);
        }

        if (isHuman && p1 > p2) {
            result = "По итогу всех игр победил Игрок 1 !" +
                    "\n[Игрок 1 [" + p1 + ":" + p2 + "] Игрок 2]";
            System.out.println(result);
        }
        if (isHuman && p1 < p2) {
            result = "По итогу всех игр победил Игрок 2 !" +
                    "\n[Игрок 1 [" + p1 + ":" + p2 + "] Игрок 2]";
            System.out.println(result);
        }
        if (isHuman && p1 == p2) {
            result = "По итогу всех игр - НИЧЬЯ!" +
                    "\n[Игрок 1 [" + p1 + ":" + p2 + "] Игрок 2]";
            System.out.println(result);
        }
        return result;

    }
}




