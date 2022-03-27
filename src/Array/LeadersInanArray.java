package Array;

import java.util.ArrayList;

public class LeadersInanArray {

    private static void findLeader(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }

            }
            if (!flag) System.out.println(arr[i]);
        }
    }

    public static void FindLeaderEfficient(int[] arr) {
        int curr_Leader = arr[arr.length - 1];
        System.out.println(curr_Leader);
        for (int i = arr.length - 2; i > 0; i--) {
            if (curr_Leader < arr[i]) {
                curr_Leader = arr[i];
                System.out.println(arr[i]);
            }
        }
    }


}
