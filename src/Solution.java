public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2,  3, 4,5,7,8,9,9,9};
        int k = removeDuplicates(nums);
        for(int i=0;i< k;i++){
            System.out.println(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=0;i< nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[k]=nums[i+1];
                k++;
            }
        }
        return k;
    }
}
