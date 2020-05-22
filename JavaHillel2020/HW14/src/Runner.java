public class Runner {
    public static void main(String[] args) {
        BubbleSort bSort = new BubbleSort();
        insertionSort iSort = new insertionSort();
        BinarySearch bSearch = new BinarySearch();
        InterSearch iSearch = new InterSearch();
        int[]testArray = {3,4,2,1,5,7,8,2};
        bSort.sort(testArray);
        iSort.sort(testArray);
        bSearch.search(testArray,0,testArray.length-1,7);
        iSearch.search(testArray,8);

    }
}
