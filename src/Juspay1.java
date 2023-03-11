import java.util.*;

public class Juspay1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        Node[] nodes = new Node[n];

        String[] nodeValues = scanner.nextLine().split(",");
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(nodeValues[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= m; j++) {
                int childIndex = i * m + j;
                if (childIndex >= n) {
                    break;
                }
                nodes[i].addChild(nodes[childIndex]);
            }
        }
        preOrderTraversal(nodes[0]);
    }

    public static void preOrderTraversal(Node node) {
        System.out.println(node.value);
        for (Node child : node.children) {
            preOrderTraversal(child);
        }
    }

    static class Node {
        String value;
        List<Node> children;


        Node(String value) {
            this.value = value;
            this.children = new ArrayList<>();
        }

        void addChild(Node child) {
            this.children.add(child);
        }
    }

}
