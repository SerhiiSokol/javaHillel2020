public class HW3ArrayMinMax {
    public static void main(String[] args) {

        int Array[] = new int[30];
        for (int a = 0; a < Array.length; a++) {
            Array[a] = ((int) (Math.random() * 25) - 13);
        }
        int min = Array[0];
        int max = Array[0];
        for (int i : Array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        for (int j = 0; j < Array.length; j++) {
            if (Array[j] == min)
                System.out.println("min Array[" + j + "] = " + Array[j]);
            if (Array[j] == max) {
                System.out.println("max Array[" + j + "] = " + Array[j]);


            }

        }
        for (int d = 0; d < Array.length; d++) {
            System.out.print(Array[d] + ", ");
        }

    }

}

