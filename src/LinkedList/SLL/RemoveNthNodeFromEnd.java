
package LinkedList.SLL;


public class RemoveNthNodeFromEnd {


//    public static ListNode removeNthFromEndEFFICIENT(ListNode head, int n) {
//        if (head == null) return head;
//        ListNode slow=head,fast=head;
//        int i=0;
//        while(fast!=null && i<n){
//            fast=fast.next;i++;
//        }
//        if(fast==null)return head.next;
//
//        while(fast.next!=null){
//            fast=fast.next;
//            slow=slow.next;
//        }
//        slow.next=slow.next.next;
//
//
//        return head;
//    }


//    public static ListNode removeNthFromEndNAIVE(ListNode head, int n) {
//        if(head==null)return head;
//        int count=0;
//        ListNode counter=head;
//        while(counter!=null){
//            count++;
//            counter=counter.next;
//        }
//        int nodetodelete=count-n;
//        ListNode temp = head;
//        if(nodetodelete<count) {
//            for (int i = 0; i < nodetodelete-1; i++) {
//                temp = temp.next;
//            }
//            temp.next=temp.next.next;
//        }
//
//        while(head!=null){
//            System.out.println(head.val);
//            head=head.next;
//        }
//
//
//        return head;
//    }

}


