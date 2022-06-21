import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        printCLL(insertAtBEGEFF(head, 0));
    }

    private static Node insertAtBEGEFF(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            int headData = head.data;
            temp.next = head.next;
            head.next = temp;
            head.data = temp.data;
            temp.data = headData;
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




