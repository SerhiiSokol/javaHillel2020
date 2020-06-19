import java.util.Arrays;

public class InsertionSort {
    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j;
            int temp = arr[i];
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] < temp)
                    break;

                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}

