package Sorting;

public class CountingInversions {
    private static int countInversion(int[] arr, int low, int high) {
        int res = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            res += countInversion(arr, low, mid);
            res += countInversion(arr, mid + 1, high);
            res += countAndMerge(arr, low, mid, high);
        }
        return res;
    }

    private static int countAndMerge(int[] arr, int low, int mid, int high) {
        int res = 0;
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) left[i] = arr[low + i]; //Low upto mid
        for (int j = 0; j < n2; j++) right[j] = arr[mid + 1 + j]; //mid+1 upto high

        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                res += (n1 - i);
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }

        return res;
    }
}
