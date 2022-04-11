public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{8, 1, 2, 3, 4};
        System.out.println(search(nums, 1));


    }

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;

            if (nums[low] <= nums[mid]) {
//                1stpart is sorted
                if (target >= nums[low] && target < nums[mid])
                    //target in same sorted half
                    high = mid - 1;
                else low = mid + 1;

            } else {
                //second part is sorted
                if (target > nums[mid] && target <= nums[high]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }


    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.println(i);
        }
    }


}