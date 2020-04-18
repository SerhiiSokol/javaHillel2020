public class HW3MinMaxReplacement {
    public static void main(String[] args) {
        int[] N = {4, -5, 0, 6, 8};
        int max = N[0];
        int min = N[0];
        double sum = 0;
        for (int i : N) {
            if (max < i) {
                max = i;
            }else if (min > i) {
                min = i;
            }
        }
        for (int s = 0; s < N.length; s++) {
            if (N[s] == min) {
                N[s] = max;
            } else if (N[s] == max) {
                N[s] = min;
            }
        }
        System.out.print("Массив после замены: ");
        for (int i : N) {
            sum += i;
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("Среднее арифметическое всех элементов массива: " + sum / N.length);
    }
}
