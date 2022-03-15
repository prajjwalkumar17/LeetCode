import java.util.Scanner;


public class Solution {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1 = new int[]{5, 0, 6, 2, 3};
        System.out.println(MaximumRainwaterEfficient(array1));
    }


    private static int MaximumRainwaterEfficient(int[] arr) {
        int result = 0;
        int[] lMax = new int[arr.length];
        lMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lMax[i] = Math.max(lMax[i - 1], arr[i]);
        }
        int[] rMax = new int[arr.length];
        rMax[arr.length - 1] = arr[arr.length - 1];
        for (int j = arr.length - 2; j >= 0; j--) {
            rMax[j] = Math.max(arr[j], rMax[j + 1]);
        }
        for (int k = 1; k < arr.length - 1; k++) {
            result += Math.min(lMax[k], rMax[k]) - arr[k];
        }
        return result;

    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
/*  int curr = 0;
        for (int num : nums) {
            curr = Math.max(curr + num, num);
            result = Math.max(curr, result);
        }
        return result;*/


}



