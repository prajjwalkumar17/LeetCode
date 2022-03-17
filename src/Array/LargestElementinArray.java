package Array;

public class LargestElementinArray {
    private static int LargestElementnaive(int[] array1) {
        for (int k : array1) {
            boolean flag = true;
            for (int i : array1) {
                if (k < i) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                return k;
            }
        }
        return -1;
    }


    private static int LargestElementEfficient(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(max, arr[i + 1]);
        }
        return max;
    }
}
