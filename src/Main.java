import java.util.*;

public class Main {
    public static void main(String[] args) {

        ListNode list = new Main.ListNode(2);
        list.next = new Main.ListNode(0);
        list.next.next = new Main.ListNode(6);
        list.next.next.next = new Main.ListNode(3);
        list.next.next.next.next = new Main.ListNode(6);
        list.next.next.next.next.next = new Main.ListNode(7);
        list.next.next.next.next.next.next = new Main.ListNode(21);
//        reverseList(list);
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

//    static ListNode reverseList(ListNode head) {
//
//
//        return prev;
//    }


    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.println(i);
        }
    }
}