import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        printCLL(deletekthNode(head, 2));
    }

    private static Node deletekthNode(Node head, int k) {
        if (head == null || head.next == head) return null;
        if (k == 1) {
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        } else {
            Node temp = head;
            for (int i = 0; i < k - 2; i++)
                temp = temp.next;
            temp.next = temp.next.next;
            return head;
        }
    }

    private static void printCLL(Node head) {
        if (head == null) return;
        Node curr = head;
        do {
            System.out.println(curr.data);
            curr = curr.next;
        } while (curr != head);
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




