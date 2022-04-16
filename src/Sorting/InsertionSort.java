package Sorting;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j] = arr[j + 1];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;

    }


}
