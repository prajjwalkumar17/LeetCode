package LinkedList.SLL;

public class MidElem {
//    public static ListNode middleNode(ListNode head) {
//        if(head==null)return head;
//        ListNode slow=head,fast=head;
//        while(fast!=null && fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        System.out.println(slow.val);
//        return slow;
//    }


    //delete mid node
//    public static ListNode removeNthFromEndNAIVE(ListNode head) {
//        if(head==null)return head;
//        if(head.next==null)return null;
//        ListNode slow=head, fast=head;
//        while(fast.next.next!=null  && fast.next.next.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        slow.next=slow.next.next;
//        return head;
//    }
}
