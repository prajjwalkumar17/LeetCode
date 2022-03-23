package Array;

/*Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]*/
public class RotateArrayByDposRight {

    //TODO 1stMethod
    public static int[] rotateArrayDPosauxD(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            rightRotateArrayByonePos(nums);
        }
        return nums;
    }

    public static int[] rightRotateArrayByonePos(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
        return arr;
    }

    //TODO Efficient Method
    private static void rotateArrayEfficient(int[] nums, int k) {
        k = k % nums.length;
        reverseArray(nums, nums.length - k, nums.length - 1);
        reverseArray(nums, 0, nums.length - k - 1);
        reverseArray(nums, 0, nums.length - 1);
    }

    private static void reverseArray(int[] nums, int low, int high) {
        while (low < high) swap(nums, high--, low++);
    }

    private static void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }

}
