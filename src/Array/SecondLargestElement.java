package Array;

public class SecondLargestElement {
    private static int secondLargest(int[] arr) {
        int res = -1;
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return arr[res];
    }
}
