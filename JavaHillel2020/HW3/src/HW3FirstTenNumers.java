public class HW3FirstTenNumers {
    public static void main(String[] args) {
        int[] c = new int[20];
        int value = 0;
        for (int i = 0; i < c.length; i++) {
            c[i] = value;
            value -= 5;
            if (i <= 9) {
                System.out.println(c[i]);
            }
        }
    }
}
