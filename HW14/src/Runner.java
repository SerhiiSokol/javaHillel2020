public class Runner {
    public static void main(String[] args) {
        int[]testArray = {3,4,2,1,5,7,8,2};
        BubbleSort.sort(testArray);
        InsertionSort.sort(testArray);
        BinarySearch.search(testArray,0,testArray.length-1,7);
        InterSearch.search(testArray,8);

    }
}
