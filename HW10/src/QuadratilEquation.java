import javax.swing.*;
import java.util.InputMismatchException;

public class QuadratilEquation {
    public static void main(String[] args) {
        double a, b, c, D;
        double x1, x2;
        JFrame frame = new JFrame();
        try {
            String hello = "Решим квадратное уравнение!";
            JOptionPane.showMessageDialog(frame, hello);

            boolean check = false;
            while (!check) {
                try {
                    String startStr = JOptionPane.showInputDialog("Для старта программы введите 'S'");
                    check = startStr.equals("s");

                } catch (NullPointerException e) {
                    String err = "Некоректный ввод, повторите сначала";
                    JOptionPane.showMessageDialog(frame, err);
                    System.exit(404);
                }
            }
            String A = JOptionPane.showInputDialog("Ввведите a");
            a = Float.parseFloat(A);
            String B = JOptionPane.showInputDialog("Ввведите b");
            b = Float.parseFloat(B);
            String C = JOptionPane.showInputDialog("Ввведите c");
            c = Float.parseFloat(C);

            D = (b * b) - 4 * a * c;

            String disr = "Дискриминант = " + String.format("%.1f", D);
            JOptionPane.showMessageDialog(frame, disr);

            if (D < 0) {
                String notFound = "D < 0 - уравнение не имеет корней";
                JOptionPane.showMessageDialog(frame, notFound);
            }
            if (D == 0) {
                x1 = (-b) / (2 * a);
                String X1 = "x1 = " + String.format("%.1f", x1);
                JOptionPane.showMessageDialog(frame, X1);
            }
            if (D > 0) {
                x1 = (-b + Math.sqrt(D)) / (2 * a);
                x2 = (-b - Math.sqrt(D)) / (2 * a);
                String X2 = "x1 = " + String.format("%.1f", x1) + "  x2 = " + String.format("%.1f", x2);
                JOptionPane.showMessageDialog(frame, X2);
            }
        } catch (InputMismatchException e) {
            String err = "Некоректный ввод, повторите сначала";
            JOptionPane.showMessageDialog(frame, err);
        }
        System.exit(1);
    }

}
