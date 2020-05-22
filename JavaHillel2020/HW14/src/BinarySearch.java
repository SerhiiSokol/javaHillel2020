class BinarySearch {
    public int search(int[] arr, int start, int last, int key) {
        if (last >= start) {
            int mid = start + (last - start) / 2;

            if (arr[mid] == key)
                return mid;

            else if (arr[mid] > key)
                return search(arr, start, mid - 1, key);
            else
                return search(arr, mid + 1, last, key);
        }

        return -1;
    }
}

