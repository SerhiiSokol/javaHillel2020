import java.util.Scanner;

public class TablX {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + number + " = " + i * number);
        }

    }
}
