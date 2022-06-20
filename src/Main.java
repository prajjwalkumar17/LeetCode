import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printlist(insertAtEnd(head, 0));
    }

    public static Node insertAtEnd(Node head, int data) {
        Node temp = new Node(data);
        Node trav = head;
        while (trav.next != null)
            trav = trav.next;
        trav.next = temp;
        temp.prev = trav;
        return head;
    }

    static void printlist(Node list) {
        if (list == null) return;
        System.out.println(list.data);
        printlist(list.next);
    }

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}




