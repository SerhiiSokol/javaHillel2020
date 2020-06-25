public class FactorialWhile {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int res = i;
        while (i <= n) {
            res = res * i;
            i++;
        }
        System.out.println(res);
    }
}
