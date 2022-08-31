public class Main {

    public static void main(String[] args) {
        ListNode node = new ListNode(7);
        node.next = new ListNode(9);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(10);
        node.next.next.next.next = new ListNode(1);
        node.next.next.next.next.next = new ListNode(8);
        node.next.next.next.next.next.next = new ListNode(6);

//        ListNode res = reverseSpecified(node, 1,7);
//        while (res != null) {
//            System.out.println(res.val);
//            res = res.next;
//        }
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






