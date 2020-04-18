public class HW3ChessBoard {
    public static void main(String[] args) {
        char[][] board = new char[8][8];

        int i;
        int j;
        for (i = 0; i < board.length; ++i) {
            for (j = 0; j < board.length; ++j) {
                if (j % 2 == 0) {
                    board[i][j] = 'W';
                } else {
                    board[i][j] = 'B';
                }
            }
        }

        for (i = 0; i < board.length; ++i) {
            if (i % 2 == 0) {
                for (j = 0; j < board.length; ++j) {
                    System.out.print(board[i][j]);
                }
            } else {
                for (j = board.length - 1; j >= 0; --j) {
                    System.out.print(board[i][j]);
                }
            }

            System.out.println();
        }

    }
}
