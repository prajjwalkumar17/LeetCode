import java.util.*;

import static java.util.Arrays.binarySearch;
//    public static class ListNode {
//        int val;
//        ListNode next;
//
//        public ListNode(int val) {
//            this.val = val;
//        }
//    }

//        ListNode list = new Main.ListNode(2);
//        list.next = new Main.ListNode(0);
//        list.next.next = new Main.ListNode(6);
//        list.next.next.next = new Main.ListNode(3);
//        list.next.next.next.next = new Main.ListNode(6);
//        list.next.next.next.next.next = new Main.ListNode(7);
//        list.next.next.next.next.next.next = new Main.ListNode(21);
//        reverseList(list);

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70};
        System.out.println(binary_SearchITERATIVE(arr, 60));


    }

    private static int binary_SearchITERATIVE(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == k) return mid;
            else if (arr[mid] > k) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    private static int binary_SearchRECURSIVE(int[] arr, int low, int high, int k) {
        if (low > high) return -1;
        int mid = (high + low) / 2;
        if (arr[mid] == k) return mid;
        else if (arr[mid] > k) return binary_SearchRECURSIVE(arr, low, mid - 1, k);
        else return binary_SearchRECURSIVE(arr, mid + 1, high, k);
    }


    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.println(i);
        }
    }
}