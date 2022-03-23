package Array;

public class Rotating_an_array_Left {

    //TODO 1st approach Theta(nd)
    private static int[] rotateArrayDPos(int[] arr, int d) {
        for (int i = 0; i < d; i++)
            rotatearray(arr);
        return arr;
    }

    private static int[] rotatearray(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }


    //TODO 2nd Approach
    private static int[] rotateArrayDPosauxD(int[] arr, int d) {
        int[] tempArr = new int[d];
        for (int j = 0; j < d; j++)
            tempArr[j] = arr[j];

        for (int i = d; i < arr.length; i++)
            arr[i - d] = arr[i];

        for (int i = 0; i < d; i++)
            arr[arr.length - d + i] = tempArr[i];
        return arr;
    }


    //TODO Efficient Approach
    private static int[] rotateArrayDPosEfficient(int[] arr, int d) {
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
        return arr;
    }

    private static int[] reverseArray(int[] arr, int low, int high) {
        while (low < high) {
            swap(arr, low, high);
            high--;
            low++;
        }
        return arr;
    }

    private static int[] swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        return arr;
    }
}
