public class Main {

    public static void main(String[] args) {
        Node node = new Node(2);
        node.next = new Node(3);
        node.next.next = new Node(4);
        node.next.next.next = new Node(5);
        node.next.next.next.next = new Node(6);

        Node res = reverseRECList(node, null);
        while (res != null) {
            System.out.println(res.data);
            res = res.next;
        }
    }

    private static Node reverseRECList(Node curr, Node prev) {
        if (curr == null) return prev;
        Node next = curr.next;
        curr.next = prev;
        return reverseRECList(next, curr);
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






