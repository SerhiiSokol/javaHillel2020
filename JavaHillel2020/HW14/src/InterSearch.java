public class InterSearch {
    public int search(int[] arr, int key) {
        int mid;
        int low = 0;
        int high = arr.length - 1;

        while (arr[low] < key && arr[high] > key) {
            if (arr[high] == arr[low])
                break;
            mid = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[mid] < key)
                low = mid + 1;
            else if (arr[mid] > key)
                high = mid - 1;
            else
                return mid;
        }

        if (arr[low] == key){
            System.out.println(low);
            return low;}
        if (arr[high] == key){
            System.out.println(high);
            return high;}
        System.out.println(-1);
        return -1;
    }
}
