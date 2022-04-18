import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3};
        int[] num2 = new int[]{1, 3, 5, 6, 7};


    }


    //TOdo to have a look how the recurssion works here


//
//    //                subsets(num1);
//    public static List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        subsets(nums, new ArrayList<Integer>(), 0, res);
//        return res;
//    }
//    public static void subsets(int[] nums, List<Integer> curr, int i, List<List<Integer>> res) {
//        if (i == nums.length) {
//            res.add(new ArrayList<>(curr)); // copy of curr is being added
//            return;
//        }
//        System.out.println(curr+"/////////////0");
//        curr.add(nums[i]);
//        System.out.println(curr+"/////////////1");
//        subsets(nums,curr,i+1,res);
//        System.out.println(curr+"/////////////2");
//        curr.remove(curr.size()-1);
//        System.out.println(curr+"/////////////3");
//
//        subsets(nums, curr, i + 1, res);
//        System.out.println(curr+"/////////////4");
//    }
//


}

