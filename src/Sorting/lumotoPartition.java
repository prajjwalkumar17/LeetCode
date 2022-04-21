package Sorting;

public class lumotoPartition {
    private static int lumotoPartion(int[] arr, int low, int high) {
        int index = low - 1;
        //todo if a pivot is supplied in the params then swap high with pivot to make it at high
//        now continue the same array
//        swap(arr[pivot],arr[high]);
        int pivot = arr[high];
        //todo swap all the elems that are low than pivot to inc the lessthan equalto windon
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) swap(arr, ++index, j);
        }
        //todo to swap the pivot to the specified i+1th pos as upto i there are less than eqaul to elems
        swap(arr, ++index, high);
        //todo return i+1
        return index + 1;
    }

    private static void swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
