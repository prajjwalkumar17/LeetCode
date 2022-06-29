public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printSLL(SortedInsert(head, 25));
    }

    private static Node SortedInsert(Node head, int k) {
        Node toAdd = new Node(k);
        if (head == null) return toAdd;
        if (k < head.data) {
            toAdd.next = head;
            return toAdd;

        }
        Node temp = head;
        while (temp.next != null && temp.next.data < k)
            temp = temp.next;
        toAdd.next = temp.next;
        temp.next = toAdd;
        return head;
    }

    private static void printSLL(Node head) {
        if (head == null) return;
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
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




