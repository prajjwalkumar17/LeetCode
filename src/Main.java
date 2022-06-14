public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        System.out.println(searchinsllREC(head, 30));
    }

    private static int searchinsllITER(Node head, int i) {
        int count = 0;
        while (head != null) {
            count++;
            if (head.data == i) return count;
            head = head.next;
        }
        return -1;
    }

    private static int searchinsllREC(Node head, int i) {
        if (head == null) return -1;
        if (head.data == i) return 1;
        else {
            int res = searchinsllREC(head.next, i);
            if (res == -1) return -1;
            else return res + 1;
        }


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




