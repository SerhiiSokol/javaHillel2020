public class inserIntoSort {
    public static void main(String[] args) {

        int[] arr = {11, 3, 14, 16, 7};
        int temp, j;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];

                for (j = i; j > 0 && temp < arr[j - 1]; j--)
                    arr[j] = temp;
            }
        }
    }
}

