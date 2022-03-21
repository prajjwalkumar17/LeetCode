package Array;

public class ReversingAnArray {


    //TODO THETA(n)
    public static int[] reverseSwapEfficient(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (high > low) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            high--;
            low++;
        }
        return arr;
    }

    //TODO THETA(n^2)
    public static int[] reversenaive(int[] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = n - 1; j > n / 2; j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

}
