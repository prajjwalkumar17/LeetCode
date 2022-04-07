package LinkedList;

public class MergetwoSortedLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

//    Main.ListNode list = new Main.ListNode(1);
//    list.next = new ListNode(2);
//    list.next.next = new ListNode(4);
//
//    Main.ListNode list2 = new Main.ListNode(1);
//    list2.next = new ListNode(3);
//    list2.next.next = new ListNode(4);
//
//    mergeTwoList(list,list2);
//
//
//    static Main.ListNode mergeTwoList(Main.ListNode list1, Main.ListNode list2){
//        Main.ListNode head=null;
//        Main.ListNode tail=null;
//        if(list1.val<=list2.val){
//            tail=head=list1;
//            list1=list1.next;
//        }
//        else{
//            tail=head=list2;
//            list2=list2.next;
//        }
//
//        while(list1!=null && list2!=null){
//            if(list1.val<=list2.val){
//                tail.next=list1;
//                tail=list1;
//                list1=list1.next;
//            }
//            else{
//                tail.next=list2;
//                tail=list2;
//                list2=list2.next;
//            }
//        }
//        if(list1==null)tail.next=list2;
//        else tail.next=list1;
//        while(head.next != null){
//            System.out.println(head.val);
//            head=head.next;
//        }
//        return head;
//    }

}
