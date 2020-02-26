public class HW3OddArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (x % 2 != 0) {
                i--;
                array[i] = x;
                System.out.print(array[i] + ", ");
            }
            x++;
        }
    }
}
