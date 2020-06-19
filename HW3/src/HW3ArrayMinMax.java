public class HW3ArrayMinMax {
    public static void main(String[] args) {

        int[] N = new int[30];
        for (int a = 0; a < N.length; a++) {
            N[a] = ((int) (Math.random() * 25) - 13);
        }
        int min = N[0];
        int max = N[0];
        for (int i : N) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        for (int j = 0; j < N.length; j++) {
            if (N[j] == min)
                System.out.println("min Array[" + j + "] = " + N[j]);
            if (N[j] == max) {
                System.out.println("max Array[" + j + "] = " + N[j]);
            }
        }
        for (int i : N) {
            System.out.print(i + ", ");
        }
    }
}

