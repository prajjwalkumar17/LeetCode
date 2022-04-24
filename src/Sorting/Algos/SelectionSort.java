package Sorting.Algos;

public class SelectionSort {
    static int[] Selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;
                swap(arr, i, min_index);
            }
        }
        return arr;

    }

    static int[] swap(int[] arr, int arr1, int arr2) {
        int tmp = arr[arr1];
        arr[arr1] = arr[arr2];
        arr[arr2] = tmp;
        return arr;
    }
}
