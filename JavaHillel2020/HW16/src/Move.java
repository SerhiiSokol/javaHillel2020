import java.util.Scanner;

public enum Move {
    ROCK, PAPER, SCISSORS, EXIT;

    public static int compareMoves(Move move1, Move move2) {
        if (move1 == move2)
            return 0;
        return switch (move1) {
            case ROCK -> (move2 == SCISSORS ? 1 : -1);
            case PAPER -> (move2 == ROCK ? 1 : -1);
            case SCISSORS -> (move2 == PAPER ? 1 : -1);
            case EXIT -> (2);
        };
    }

    static Move getMove(boolean isHuman) {
        if (!isHuman) {
            int ai = (int) (Math.random() * 3);
            switch (ai) {
                case 0:
                    return Move.ROCK;
                case 1:
                    return Move.PAPER;
                case 2:
                    return Move.SCISSORS;
            }

        } else {
            System.out.println();
            System.out.println("Введите 0 для выбора КАМНЯ, 1 для выбора БУМАГИ, либо 2 для выбора НОЖНИЦ, 3 для ВЫХОДА");
            Scanner sc = new Scanner(System.in);
            int player = sc.nextInt();

            switch (player) {
                case 0:
                    return Move.ROCK;
                case 1:
                    return Move.PAPER;
                case 2:
                    return Move.SCISSORS;
                case 3:
                    return Move.EXIT;

            }
        }
        return Move.EXIT;
    }
}
