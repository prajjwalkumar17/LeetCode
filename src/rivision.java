import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rivision {
    public static void main(String[] args) {
        //TODO second largest element in an array

        List<Integer> list = new ArrayList<>();
        int[] arr = new int[]{22, 0, 24, 90, 88, 88, 1};
//        System.out.println(Arrays.toString(RotateByDPosEff(arr, 2)));
        MaxDifference(arr);
    }

    private static void MaxDifference(int[] arr) {
        int min = arr[0];
        int maxOutput = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - min;
            maxOutput = Math.max(diff, maxOutput);
            min = Math.min(min, arr[i]);
        }
        System.out.println(maxOutput);
    }

    private static void PrintLeadersArray(int[] arr) {
        int maxIndex = arr.length - 1;
        System.out.println(arr[maxIndex]);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
                System.out.println(arr[i]);
            }
        }
    }

    public static int[] RotateByDPosEff(int[] arr, int d) {
        ReverseArray(arr, 0, d - 1);
        ReverseArray(arr, d, arr.length - 1);
        ReverseArray(arr, 0, arr.length - 1);
        return arr;
    }

    private static void ReverseArray(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static int[] RotateByDPosNaive(int[] arr, int d) {
        int[] temp = new int[d];
        System.arraycopy(arr, 0, temp, 0, d);
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        System.arraycopy(temp, 0, arr, arr.length - d, d);
        return arr;
    }

    public static int[] LeftRotateAnArrayByOneClockWise(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = last;
        return arr;
    }

    public static int[] LeftRotateAnArrayByOneAntiClockWise(int[] arr) {
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        return arr;
    }

    public static int[] MoveZerosToEnd(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(i, res, arr);
                res++;
            }
        }
        return arr;
    }

    private static void swap(int i, int i1, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    public static int RemoveDups(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        return res;
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
