import javax.swing.plaf.basic.BasicArrowButton;
import java.util.*;

public class Juspay1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int napi = scanner.nextInt();
        scanner.nextLine();

        Node[] nodes = new Node[n];
        String[] nodeValues = new String[n];
        for (int i = 0; i < n; i++) {
//            String nodeVals= scanner.nextLine();
            nodeValues[i] = scanner.nextLine();
            nodes[i] = new Node(nodeValues[i]);
        }
        TreeBuilder tree = new TreeBuilder(nodes, m);
        while (napi-- > 0) {
            String query = scanner.nextLine();
            String[] tokens = query.split("\\s+");
            int opr = Integer.parseInt(tokens[0]);
            String nodeVal = tokens[1];
            int lockById = Integer.parseInt(tokens[2]);

            switch (opr) {
                case 1 -> System.out.println(tree.lock(nodeVal, lockById));
                case 2 -> System.out.println(tree.unlock(nodeVal, lockById));
                case 3 -> System.out.println(tree.upgrade(nodeVal, lockById));
            }
        }
    }

    public static void preOrderTraversal(Node node) {
        if (node == null) return;
        System.out.println(node.value);
        for (Node child : node.childrens) {
            preOrderTraversal(child);
        }
    }

    static class Node {
        String value;
        List<Node> childrens;
        boolean isLocked;
        int lockedById;
        Node parent;

        Node(String value) {
            this.value = value;
            isLocked = false;
            lockedById = -1;
            childrens = new ArrayList<>();
            parent = null;
        }

        void addChild(Node child) {
            this.childrens.add(child);
        }

        public boolean checkLockedDescendants() {
            for (Node child : childrens) {
                if (child.isLocked || child.checkLockedDescendants()) {
                    return true;
                }
            }
            return false;
        }

        public boolean checkLockedAncestor(int id) {
            Node curr = parent;
            while (curr != null) {
                if (curr.isLocked && curr.lockedById != id) {
                    return true;
                }
                curr = curr.parent;
            }
            return false;
        }

        public boolean lock(int id) {
            if (checkLockedAncestor(id) || checkLockedDescendants() || isLocked) {
                return false;
            }
            isLocked = true;
            lockedById = id;
            return true;
        }

        public boolean unlock(int id) {
            if (!isLocked || lockedById != id) {
                return false;
            }
            isLocked = false;
            lockedById = -1;
            return true;
        }

        public boolean upgrade(int id) {
            if (isLocked || checkLockedAncestor(id)) {
                return false;
            }
            boolean hasLockedDescendants = false;
            for (Node child : childrens) {
                if (child.isLocked || child.checkLockedDescendants()) {
                    hasLockedDescendants = true;
                    break;
                }
            }
            if (!hasLockedDescendants) {
                return false;
            }
            for (Node child : childrens) {
                if (!child.unlock(id)) {
                    return false;
                }
            }
            isLocked = true;
            lockedById = id;
            return true;
        }
    }

    public static class TreeBuilder {
        private Node root;
        private Map<String, Node> treeMap;

        public TreeBuilder(Node[] vals, int m) {
            root = vals[0];
            treeMap = new HashMap<>();

            for (int i = 0; i < vals.length; i++) {
                for (int j = 1; j <= m; j++) {
                    int childIndex = i * m + j;
                    if (childIndex >= vals.length) {
                        break;
                    }
                    vals[i].addChild(vals[childIndex]);
                }
                treeMap.put(vals[i].value, vals[i]);
            }
        }
        //I guess implementing this can correct the code
      /*  public TreeBuilder(String[] vals, int m) {
            root = new Node(vals[0]);
            treeMap = new HashMap<>();
            treeMap.put(vals[0], root);
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            int i = 1;
            while (!queue.isEmpty()) {
                Node curr = queue.poll();
                for (int j = 0; j < m && i < vals.length; j++) {
                    Node child = new Node(vals[i++]);
                    curr.childrens.add(child);
                    child.parent = curr;
                    treeMap.put(child.value, child);
                    queue.offer(child);
                }
            }
        }*/

        public boolean lock(String val, int id) {
            Node node = treeMap.get(val);
            return node != null && node.lock(id);
        }

        public boolean unlock(String val, int id) {
            Node node = treeMap.get(val);
            return node != null && node.unlock(id);
        }

        public boolean upgrade(String val, int id) {
            Node node = treeMap.get(val);
            return node != null && node.upgrade(id);
        }
    }
}
