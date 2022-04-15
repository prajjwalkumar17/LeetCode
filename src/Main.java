import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] num1 = new int[]{11, 22, 13, 84};
        char[] num2 = new char[]{'A', 'B', 'a', 'c', 'D'};
        System.out.println(Arrays.toString(bubblesort(num1)));


    }

    static int[] bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);

        return arr;
    }

    static int[] swap(int[] arr, int arr1, int arr2) {
        int tmp = arr[arr1];
        arr[arr1] = arr[arr2];
        arr[arr2] = tmp;
        return arr;
    }

}
