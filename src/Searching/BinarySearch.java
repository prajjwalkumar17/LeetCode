package Searching;

public class BinarySearch {

    private static int binary_SearchITERATIVE(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == k) return mid;
            else if (arr[mid] > k) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    private static int binary_SearchRECURSIVE(int[] arr, int low, int high, int k) {
        if (low > high) return -1;
        int mid = (high + low) / 2;
        if (arr[mid] == k) return mid;
        else if (arr[mid] > k) return binary_SearchRECURSIVE(arr, low, mid - 1, k);
        else return binary_SearchRECURSIVE(arr, mid + 1, high, k);
    }


}
