import java.util.Arrays;

public class Main {
    static final int CHAR = 256;

    public static void main(String[] args) {
//        Node  head=new Node(10);
//        head.next=new Node(20);
//        head.next.next=new Node(30);
        Node newHead = null;
        newHead = insertAtEnd(newHead, 0);
        newHead = insertAtEnd(newHead, 10);
        newHead = insertAtEnd(newHead, 20);
        newHead = insertAtEnd(newHead, 30);
        newHead = insertAtEnd(newHead, 40);
        newHead = insertAtEnd(newHead, 50);
        printlist(newHead);
    }

    private static Node insertAtEnd(Node head, int i) {
        if (head == null) {
            head = new Node(i);
            return head;
        }
        Node res = head;
        while (head.next != null) {
            head = head.next;
        }
        head.next = new Node(i);
        return res;
    }

    static void printlist(Node list) {
        if (list == null) return;
        System.out.println(list.data);
        printlist(list.next);
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}




