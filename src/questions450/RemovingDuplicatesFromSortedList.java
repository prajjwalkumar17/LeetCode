package questions450;

public class RemovingDuplicatesFromSortedList {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int x) {
            this.val = x;
            this.next = null;
        }


        public ListNode removeDuplicates(ListNode head) {
            if (head == null) {
                return head;
            }
            ListNode temp = head.next;
            ListNode curr = head;
            if (curr.next == null) {
                return head;
            }
            while (temp.next != null) {
                if (curr.val == temp.val) {
                    curr.next = temp.next;
                    temp = temp.next;
                } else {
                    temp = temp.next;
                    curr = curr.next;
                }
            }
            if (curr.val == temp.val) {
                curr.next = null;
            } else {
                curr.next = temp;
            }
            return head;
        }
    }


}
