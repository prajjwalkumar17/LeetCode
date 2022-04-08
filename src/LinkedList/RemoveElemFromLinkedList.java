package LinkedList;

public class RemoveElemFromLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }


//    public static Main.ListNode removeElements(Main.ListNode head, int val) {
//        while(head!=null && head.val==val)
//            head=head.next;
//
//        Main.ListNode res=head;
//        while(res!=null && res.next!=null){
//            if(res.next.val==val)
//                res.next=res.next.next;
//            else
//                res=res.next;
//        }
//        return head;
//    }


}
