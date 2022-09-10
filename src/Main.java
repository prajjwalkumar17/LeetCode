import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListNode node = new ListNode(7);
        node.next = new ListNode(9);
        node.next.next = new ListNode(9);
        node.next.next.next = new ListNode(9);
        node.next.next.next.next = new ListNode(1);
        node.next.next.next.next.next = new ListNode(1);
        node.next.next.next.next.next.next = new ListNode(6);

        ListNode res = rremoveDuplicate(node);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode rremoveDuplicate(ListNode node) {
        ListNode res = node;
        while (node.next != null) {
            if (node.val == node.next.val) node.next = node.next.next;
            else
                node = node.next;
        }
        return res;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}






