package LinkedList;

public class InsertAtBegningAndEnd {
    private static Node insertAtBegining(Node head, int i) {
        Node temp = new Node(i);
//        temp.next=head;
        return temp;
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

//    private static Main.Node insertAtEnd(Main.Node head, int i) {
//        if(head==null){
//            head=new Main.Node(i);
//            return head;
//        }
//        Main.Node res=head;
//        while(head.next!=null){
//            head=head.next;
//        }
//        head.next= new Main.Node(i);
//        return res;
//    }

}
