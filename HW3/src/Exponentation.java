public class Exponentation {
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        for (int i = 1; i < n; i++) {
            x *= x;
        }
        System.out.println(x);
    }
}