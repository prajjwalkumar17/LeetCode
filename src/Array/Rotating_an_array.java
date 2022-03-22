package Array;
/*Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]*/
public class Rotating_an_array {
 /*   public static void rotate(int[] nums, int k) {
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
    }*/


    //TODO 1st approach Theta(nd)
    private static int[] rotateArrayDPos(int[] arr, int d) {
        for (int i = 0; i < d; i++)
            rotatearray(arr);
        return arr;
    }

    private static int[] rotatearray(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }


    //TODO 2nd Approach
    private static int[] rotateArrayDPosauxD(int[] arr, int d) {
        int[] tempArr = new int[d];
        for (int j = 0; j < d; j++)
            tempArr[j] = arr[j];

        for (int i = d; i < arr.length; i++)
            arr[i - d] = arr[i];

        for (int i = 0; i < d; i++)
            arr[arr.length - d + i] = tempArr[i];
        return arr;
    }
}
