package Array;
/*Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]*/
public class Rotating_an_array {
    public static void rotate(int[] nums, int k) {
        for(int p=nums.length-1;p>= nums.length-k;p--){
            int temp=nums[p];
            for(int u=p-1;u>=0;u--){
                nums[u+1]=nums[u];
            }
            nums[0]=temp;
        }

        for (int a=0;a< nums.length;a++){
            System.out.println(nums[a]);
        }
    }
}
