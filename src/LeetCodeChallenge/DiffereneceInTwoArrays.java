package LeetCodeChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Input: nums1 = [1,2,3], nums2 = [2,4,6]
        Output: [[1,3],[4,6]]
        Explanation:
        For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
        For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are n

        Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
        Output: [[3],[]]
        Explanation:
        For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
        Every integer in nums2 is present in nums1. Therefore, answer[1] = [].*/
public class DiffereneceInTwoArrays {


    /*    int[] num1 = new int[]{1,2,3,3};
        int[] num2 = new int[]{1,1,2,2};
        List<List<Integer>> result=findDifference(num1,num2);
            for(List i:result){
            System.out.println(i);
        }*/
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        for (int value : nums1) {
            boolean flag = false;
            for (int i : nums2) {
                if (value == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result1.add(value);
            }

        }
        for (int j : nums2) {
            boolean flag = false;
            for (int k : nums1) {
                if (j == k) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result2.add(j);
            }

        }

        result.add(result1.stream().distinct().collect(
                Collectors.toList()));
        result.add(result2.stream().distinct().collect(
                Collectors.toList()));
        return result;

    }
}
