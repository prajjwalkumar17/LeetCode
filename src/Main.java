import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] num1 = new int[]{1, 2, 2, 1, 4, 6, 7, 8, 8};
        int[] num2 = new int[]{2, 2, 8, 4, 6};
        int[] result = intersection(num1, num2);
        for (int j : result) System.out.println(j);
    }


    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (!arr.contains(nums1[i])) {
                    arr.add(nums1[i]);
                    i++;
                    j++;
                }
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        int[] res = new int[arr.size()];
        for (int h = 0; h < arr.size(); h++) {
            res[h] = arr.get(h);
        }
        return res;

    }

}
