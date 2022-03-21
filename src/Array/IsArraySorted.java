package Array;

public class IsArraySorted {

    //TODO O(n^2)
    private static boolean isSortedNaive(int[] num1) {
        for (int i = 0; i < num1.length; i++) {
            for (int j = i + 1; j < num1.length; j++) {
                if (num1[i] < num1[j]) {
                    return false;
                }

            }
        }
        return true;
    }


    //TODO O(n)
    public static Boolean isSortedEfficient(int[] nums1) {
        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] < nums1[i - 1]) {
                return false;
            }
        }
        return true;
    }

}

