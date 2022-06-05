package LinkedList;

public class DeleteAtBeginingAndEnd {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

//    private static Node deleteAtBegining(Node head) {
//        return head.next;
//    }

//    private static Main.Node deleteAtEnd(Main.Node head) {
//        if(head==null || head.next==null)return null;
//        Main.Node temp=head;
//        while(temp.next.next!=null){
//            temp=temp.next;
//        }
//        temp.next=null;
//        return head;
//    }
}
