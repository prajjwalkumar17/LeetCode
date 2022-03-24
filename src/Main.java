public class Main {

    public static void main(String[] args) {

        int[] num1 = new int[]{-3};
        System.out.println(MaximumSubarraykaadane(num1));

    }

    private static int MaximumSubarraykaadane(int[] nums) {
        int result = nums[0];
        int curr = 1;
        for (int num : nums) {
            curr = Math.max(curr * num, num);
            result = Math.max(curr, result);
        }
        return result;
    }


    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.println(i);

        }
    }

}