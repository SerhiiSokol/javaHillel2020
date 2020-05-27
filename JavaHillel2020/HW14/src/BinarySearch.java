class BinarySearch {
    static int search(int[] arr, int start, int last, int key) {
        if (last >= start) {
            int mid = start + (last - start) / 2;

            if (arr[mid] == key) {
                System.out.println(mid);
                return mid;
            }
            else if (arr[mid] > key)
                return search(arr, start, mid - 1, key);
            else
                return search(arr, mid + 1, last, key);
        }
        System.out.println(-1);
        return -1;
    }
}

