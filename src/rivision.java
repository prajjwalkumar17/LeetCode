import java.util.Arrays;

public class rivision {
    public static void main(String[] args) {
        //TODO second largest element in an array

        int[] arr = new int[]{22, 24, 88, 1};
        System.out.println(Arrays.toString(ReverseAnArray(arr)));


    }

    public static int[] ReverseAnArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }

    public static int LargestNo(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }

    public static boolean IsSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i - 1] > arr[i])
                return false;
        return true;
    }

    public static int SecondLargestNo(int[] arr) {
        int secondLargestIndex = -1;
        int largestIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[largestIndex] < arr[i]) {
                secondLargestIndex = largestIndex;
                largestIndex = i;
            } else if (arr[i] < arr[largestIndex]) {
                if (secondLargestIndex == -1)
                    secondLargestIndex = i;
                else if (arr[secondLargestIndex] < arr[i])
                    secondLargestIndex = i;
            }
        }
        return secondLargestIndex;
    }
}
