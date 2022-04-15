package Sorting;

public class BubbleSort {

    int[] bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);

        return arr;
    }

    int[] swap(int[] arr, int arr1, int arr2) {
        int tmp = arr[arr1];
        arr[arr1] = arr[arr2];
        arr[arr2] = tmp;
        return arr;
    }

}
