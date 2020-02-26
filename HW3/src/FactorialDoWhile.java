public class FactorialDoWhile {
    public static void main(String[] args) {
        double n = 7;
        double i = 1;
        double res = i;
        do {
            res = res * i;
            i++;
        }
        while (i <= n);
        System.out.println(res);
    }
}
