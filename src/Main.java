public class Main {
    public static void main(String[] args) {
        int[] num2 = new int[]{-2, 3, 4, 6, -5};
        int[] num1 = new int[]{1, 3, -5};
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        ListNode teno = removeNthFromEndNAIVE(head, 5);
        while (teno != null) {
            System.out.println(teno.val);
            teno = teno.next;
        }
    }




}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

