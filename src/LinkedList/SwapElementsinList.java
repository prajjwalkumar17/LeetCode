package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class SwapElementsinList {

    private static ListNode SwapELementsinList(ListNode head, int k) {
        ListNode curr = head;
        List<ListNode> nodeList = new ArrayList<>();
        while (curr != null) {
            nodeList.add(curr);
            curr = curr.next;
        }
        int size = nodeList.size();
        int temp = nodeList.get(k - 1).data;
        nodeList.get(k - 1).data = nodeList.get(size - k).data;
        nodeList.get(size - k).data = temp;
        return head;
    }


   /*Main.ListNode head=new Main.ListNode(1);
    head.next=new ListNode(2);
    head.next.next=new ListNode(3);
    head.next.next.next=new ListNode(4);
    head.next.next.next.next=new ListNode(5);*/

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            next = null;
        }


    }
}
