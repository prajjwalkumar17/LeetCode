package LinkedList.DLL;

public class DLL {


    public static class Node {
        int data;
        Main.Node next;
        Main.Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
