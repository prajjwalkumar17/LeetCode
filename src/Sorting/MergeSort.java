package Sorting;

public class MergeSort {
    public static int[] sortArray(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    static int[] mergeSort(int[] arr, int l, int r) {
        if (r > l) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
        return arr;
    }

    static void merge(int[] arr, int l, int m, int h) {
        //create separate arrays for the elements
        //array is 0 indexed
        int n1 = m - l + 1, n2 = h - m;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) left[i] = arr[i + l];
        for (int j = 0; j < n2; j++) right[j] = arr[m + 1 + j];

        //sorting process
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];

    }


}
