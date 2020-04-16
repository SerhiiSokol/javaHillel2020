public class BubbleSort {
        public static void main(String[] args) {
            int [] testArr = {11, 3, 14, 16, 7};
            boolean isSorted = false;
            int a;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < testArr.length-1; i++) {
                    if(testArr[i] > testArr[i+1]){
                        isSorted = false;

                        a = testArr[i];
                        testArr[i] = testArr[i+1];
                        testArr[i+1] = a;
                    }
                }
            }
            for (int i = 0; i<testArr.length;i++)
            System.out.print(testArr[i]+ " ");
        }
    }

