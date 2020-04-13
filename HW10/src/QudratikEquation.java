import java.util.Scanner;

public class QudratikEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double a, b, c, d;
        double x1, x2;
        System.out.println (" : ");
        a = in.nextDouble ();
        System.out.println (" b: ");
        b = in.nextDouble ();
        System.out.println (" c: ");
        c = in.nextDouble ();
        d = Math.pow (b, 2) - (4 * a * c);
        if ( d >= 0){
            x1 = ((-1) * b + Math.sqrt (d)) / 2 * a;
            x2 = ((-1) * b - Math.sqrt (d)) / 2 * a;
            System.out.printf ("x1 = " + x1 + " x2 = " + x2);
        }
else if (d == 0) {
            x1 = (-1) * b;
            System.out.printf ("x1, x2 = " + x1);
        } else
            System.out.print (". D  ");
    }

}

