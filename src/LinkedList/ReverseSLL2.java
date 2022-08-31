package LinkedList;

public class ReverseSLL2 {
    //todo 92. Reverse Linkedlist2
//BEST METHOD
//    private static ListNode reverseSpecifiedITER(ListNode head, int left, int right) {
//        if(head==null)return head;
//        ListNode curr=head;
//        ListNode prev=null;
//        //Traverse to the left
//        while(left>1){
//            prev=curr;
//            curr=curr.next;
//            left--;right--;
//        }
//        //Init tail and start
//        ListNode start=prev,tail=curr;
//        //start reversing
//        while(right>0){
//            ListNode next=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//            right--;
//        }
//
//        //if left is 1
//        if(start!=null) start.next=prev;
//        else head=prev;
//
//        //last connection
//        tail.next=curr;
//        return head;
//    }

    //RECURSIVE
//    public ListNode reverseBetween(ListNode curr, int left, int right) {
//        ListNode head=curr;
//        return reverse(head,left,right);
//    }
//
//
//    private static ListNode reverse(ListNode head, int left, int right) {
//        if(left>right)return head;
//        ListNode leftHead=head;
//        ListNode rightHead=head;
//        int leftData=-1,rightData=-1;
//        for(int i=1;i<=right;i++){
//            if(i==left)leftData=rightHead.val;
//            if(i==right){
//                rightData=rightHead.val;
//                rightHead.val=leftData;
//            }
//            rightHead=rightHead.next;
//        }
//        for(int i=1;i<=left;i++){
//            if(i==left)
//                leftHead.val=rightData;
//            leftHead=leftHead.next;
//        }
//        return reverse(head,left+1,right-1);
//    }
}
