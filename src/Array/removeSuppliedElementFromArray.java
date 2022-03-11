package Array;

/*Given an integer array nums and an integer val,remove all occurrences of val in nums in-place.The relative order of the elements may be changed.
        Since it is impossible to change the length of the array in some languages,you must instead have the result be placed in the first part of the array nums.
        More formally,if there are k elements after removing the duplicates,then the first k elements of nums should hold the final result.It does not matter what you
        leave beyond the first k elements.
        Return k after placing the final result in the first k slots of nums.

        Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
        */
public class removeSuppliedElementFromArray {
    public static void main(String[] args) {
        int[] arrray = new int[]{3, 3};
        int k = removeElement(arrray, 5);
        System.out.println("The length of output array is " + k);
        for (int i = 0; i <= k - 1; i++) {
            System.out.println(arrray[i]);
        }
    }

    public static int removeElement(int[] nums, int val) {
        System.out.println("The length of supplied array is " + nums.length);

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
