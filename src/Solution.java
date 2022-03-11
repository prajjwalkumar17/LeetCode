import java.util.Scanner;


public class Solution {


    public static void main(String[] args) {

        int arr[] = new int[]{2, 3, 4, 5, 6};

        printArray(reversearray(arr, 0, arr.length - 1));
    }

    private static int[] reversearray(int[] arr, int start, int end) {

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}
