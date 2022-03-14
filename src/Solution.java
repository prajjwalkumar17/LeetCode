import java.util.Scanner;


public class Solution {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1 = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, -4};
        System.out.println(MaximumSubarraynaive(array1));
    }


    private static int MaximumSubarraynaive(int[] nums) {
        int result = nums[0];
        int curr = 0;
        for (int num : nums) {
            curr = Math.max(curr + num, num);
            result = Math.max(curr, result);
        }
        return result;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}



