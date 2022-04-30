package Searching;

public class peakMountain {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            //until the array was sorted it kept increasing
            if (arr[mid] < arr[mid + 1]) low = mid + 1;
                //once the elem was found where the next elem of it was smaller than the elem we come out
            else high = mid;
        }
        return low;
    }
}
