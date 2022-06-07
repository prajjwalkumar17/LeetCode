import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printlist(insertAtPos(head, 2, 4));
    }

    private static Node insertAtPos(Node head, int data, int pos) {
        Node temp = head;
        int i = 0;
        Node res = new Node(data);
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        if (pos == 1) {
            //if the pos is head
            res.next = head;
            return res;
        }
        //legal pos
        //if the pos is something diff than head\
        Node tem = head;
        for (int j = 1; j <= pos - 2 && tem != null; j++)
            tem = tem.next;

        if (tem == null) return head;
        res.next = tem.next;
        tem.next = res;
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

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}




