public class Main {
    public static void main(String[] args) {
        int[] num2 = new int[]{-2, 3, 4, 6, -5};
        int[] num1 = new int[]{1, 3, -5};
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        removeNthFromEndNAIVE(head, 1);
    }


    public static ListNode removeNthFromEndNAIVE(ListNode head, int n) {
        if (head == null) return head;
        int count = 0;
        ListNode counter = head;
        while (counter != null) {
            count++;
            counter = counter.next;
        }
        int nodetodelete = count - n;
        ListNode temp = head;
        if (nodetodelete < count) {
            for (int i = 0; i < nodetodelete - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }


        return head;
    }

}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

