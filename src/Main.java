import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        printCLL(deleteHead(head));
    }

    private static Node deleteHeadEFF(Node head) {
        if (head == null || head.next == head) return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    private static void printCLL(Node head) {
        if (head == null) return;
        Node curr = head;
        do {
            System.out.println(curr.data);
            curr = curr.next;
        } while (curr != head);
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




