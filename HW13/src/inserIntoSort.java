public class inserIntoSort {
      int [] testArr = {11, 3, 14, 16, 7};
        int temp, j;
        for(int i = 0; i < testArr.length - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];

                for (j = i; j >0 && temp < arr[j - 1]; j--)
                    arr[j] = temp;
            }
        }
    }
}
