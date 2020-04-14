import java.lang.*;

public class NumToGrafExample {
    public static void main(String[] args) {
        String s = "944";
        String[] i = s.split("");
        int[][] n = {{9, 8, 3, 3, 3, 8, 9}, {12, 10, 7, 12, 12, 12, 6}, {6, 3, 15, 6, 4, 4, 0}, {6, 3, 15, 6, 15, 3, 6}, {4, 2, 2, 2, 0, 14, 14}, {0, 4, 4, 1, 15, 3, 6}, {6, 3, 4, 1, 3, 3, 6}, {0, 2, 13, 12, 11, 11, 11}, {6, 3, 3, 6, 3, 3, 6}, {6, 3, 3, 5, 15, 3, 6}};
        String[] b = {"@@@@@@@", "@@@@@@ ", "@    @ ", "@     @", "@      ", " @@@@@@", " @@@@@ ", " @ @   ", " @   @ ", "  @@@  ", "  @@   ", "  @    ", "   @   ", "    @  ", "     @ ", "      @"};
        for (int m = 0; m < 7; m++) {
            for (String value : i) System.out.print(b[n[Integer.parseInt(value)][m]] + " ");
            System.out.print ("\n");
        }
    }
}
//Интересное решение задания, для примера взято со stackoverflow.