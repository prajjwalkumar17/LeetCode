package LinkedList;

public class InsertAtBegningAndEnd {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

//    private static Node insertAtBegining(Node head, int i) {
//        Node temp = new Node(i);
//        temp.next=head;
//        return temp;
//    }


//    private static Node insertAtEnd(Node head, int i) {
//        if(head==null){
//            head=new Node(i);
//            return head;
//        }
//        Node res=head;
//        while(head.next!=null){
//            head=head.next;
//        }
//        head.next= new Node(i);
//        return res;
//    }

}
