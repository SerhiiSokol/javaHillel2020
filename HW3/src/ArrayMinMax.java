public class ArrayMinMax {
    public static void main(String[] args) {
        int[] myArr = new int[30];
        int min = myArr[0];
        int max = myArr[0];


        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = ((int) (Math.random() * 25) - 13);
        }

        for (int element : myArr) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        for (int j = 0; j < myArr.length; j++) {
            if (myArr[j] == min)
                System.out.println("min Array[" + j + "] = " +myArr[j]);
            if (myArr[j] == max) {
                System.out.println("max Array[" + j + "] = " + myArr[j]);
            }
        }
        for (int i : myArr) {
            System.out.print(i + ", ");
        }
    }
}

