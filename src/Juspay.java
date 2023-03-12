import java.util.*;

public class Juspay {
    /*    class Node {
            int val;
            boolean isLocked;
            int lockedBy;
            List<Node> childrens;

            public Node(int val) {
                this.val = val;
                isLocked = false;
                lockedBy = -1;
                childrens = new ArrayList<>();
            }
        }

        class TreeLock {
            private Node root;
            private Map<Integer, Node> nodesById;

            public TreeLock(int m) {
                root = new Node(0);
                nodesById = new HashMap<>();
                nodesById.put(0, root);
                createTree(root, 1, m);
            }

            private void createTree(Node parent, int val, int m) {
                for (int i = 0; i < m; i++) {
                    Node child = new Node(val++);
                    parent.childrens.add(child);
                    nodesById.put(child.val, child);
                    createTree(child, val, m);
                }
            }

            public boolean lock(int val, int id) {
                Node node = nodesById.get(val);
                if (node == null) {
                    return false;
                }
                if (node.isLocked || checkLockedAncestor(node) || hasLockedDescendant(node)) {
                    return false;
                }
                node.isLocked = true;
                node.lockedBy = id;
                return true;
            }

            public boolean unlock(int val, int id) {
                Node node = nodesById.get(val);
                if (node == null || !node.isLocked || node.lockedBy != id) {
                    return false;
                }
                node.isLocked = false;
                node.lockedBy = -1;
                return true;
            }

            public boolean upgrade(int val, int id) {
                Node node = nodesById.get(val);
                if (node == null || node.isLocked || checkLockedAncestor(node) || !hasLockedDescendant(node) || !areAllDescendantsLockedBy(node, id)) {
                    return false;
                }
                unlockDescendants(node);
                node.isLocked = true;
                node.lockedBy = id;
                return true;
            }

            private boolean checkLockedAncestor(Node node) {
                while (node != null) {
                    if (node.isLocked) {
                        return true;
                    }
                    node = nodesById.get((node.val - 1) / m);
                }
                return false;
            }

            private boolean hasLockedDescendant(Node node) {
                if (node.isLocked) {
                    return true;
                }
                for (Node child : node.childrens) {
                    if (hasLockedDescendant(child)) {
                        return true;
                    }
                }
                return false;
            }

            private boolean areAllDescendantsLockedBy(Node node, int id) {
                if (node.isLocked && node.lockedBy != id) {
                    return false;
                }
                for (Node child : node.childrens) {
                    if (!areAllDescendantsLockedBy(child, id)) {
                        return false;
                    }
                }
                return true;
            }

            private void unlockDescendants(Node node) {
                node.isLocked = false;
                node.lockedBy = -1;
                for (Node child : node.childrens) {
                    unlockDescendants(child);
                }
            }
        }
    static class Node {
            int val;
            boolean isLocked;
            int lockedBy;
            Node parent;
            List<Node> childrens;

            Node(int val) {
                this.val = val;
                isLocked = false;
                lockedBy = -1;
                parent = null;
                childrens = new ArrayList<>();
            }

            boolean checkLockedAncestor() {
                Node node = parent;
                while (node != null) {
                    if (node.isLocked) {
                        return true;
                    }
                    node = node.parent;
                }
                return false;
            }
        }

        class Tree {
            Node root;
            Map<Integer, Node> nodesById;

            Tree(int m, int n) {
                nodesById = new HashMap<>();
                for (int i = 1; i <= n; i++) {
                    Node node = new Node(i);
                    nodesById.put(i, node);

                    if (i != 1) {
                        Node parent = nodesById.get((i - 2) / m + 1);
                        node.parent = parent;
                        parent.childrens.add(node);
                    } else {
                        root = node;
                    }
                }
            }

            boolean lock(int v, int id) {
                Node node = nodesById.get(v);
                if (node.isLocked || node.checkLockedAncestor()) {
                    return false;
                } else {
                    node.isLocked = true;
                    node.lockedBy = id;
                    return true;
                }
            }

            boolean unlock(int v, int id) {
                Node node = nodesById.get(v);
                if (!node.isLocked || node.lockedBy != id) {
                    return false;
                } else {
                    node.isLocked = false;
                    node.lockedBy = -1;
                    return true;
                }
            }

            boolean upgrade(int v, int id) {
                Node node = nodesById.get(v);
                if (node.isLocked || node.checkLockedAncestor()) {
                    return false;
                }
                boolean canUpgrade = true;
                for (Node child : node.childrens) {
                    canUpgrade &= child.isLocked && child.lockedBy == id;
                }
                if (!canUpgrade) {
                    return false;
                }
                for (Node child : node.childrens) {
                    unlock(child.val, id);
                }
                node.isLocked = true;
                node.lockedBy = id;
                return true;
            }
        }*/
    class Node {
        String val;
        List<Node> children;
        boolean locked;
        int lockedById;
        Node parent;

        public Node(String val) {
            this.val = val;
            locked = false;
            lockedById = -1;
            children = new ArrayList<>();
            parent = null;
        }

        public boolean hasLockedDescendants() {
            for (Node child : children) {
                if (child.locked || child.hasLockedDescendants()) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasLockedAncestor(int id) {
            Node curr = parent;
            while (curr != null) {
                if (curr.locked && curr.lockedById != id) {
                    return true;
                }
                curr = curr.parent;
            }
            return false;
        }

        public boolean lock(int id) {
            if (hasLockedAncestor(id) || hasLockedDescendants()) {
                return false;
            }
            locked = true;
            lockedById = id;
            return true;
        }

        public boolean unlock(int id) {
            if (!locked || lockedById != id) {
                return false;
            }
            locked = false;
            lockedById = -1;
            return true;
        }

        public boolean upgrade(int id) {
            if (locked || hasLockedAncestor(id)) {
                return false;
            }
            boolean hasLockedDescendants = false;
            for (Node child : children) {
                if (child.locked || child.hasLockedDescendants()) {
                    hasLockedDescendants = true;
                    break;
                }
            }
            if (!hasLockedDescendants) {
                return false;
            }
            for (Node child : children) {
                if (!child.unlock(id)) {
                    return false;
                }
            }
            locked = true;
            lockedById = id;
            return true;
        }
    }

    public class MAryTree {
        private Node root;
        private Map<String, Node> nodesByVal;

        public MAryTree(String[] vals, int m) {
            root = new Node(vals[0]);
            nodesByVal = new HashMap<>();
            nodesByVal.put(vals[0], root);
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            int i = 1;
            while (!queue.isEmpty()) {
                Node curr = queue.poll();
                for (int j = 0; j < m && i < vals.length; j++) {
                    Node child = new Node(vals[i++]);
                    curr.children.add(child);
                    child.parent = curr;
                    nodesByVal.put(child.val, child);
                    queue.offer(child);
                }
            }
        }

        public boolean lock(String val, int id) {
            Node node = nodesByVal.get(val);
            return node != null && node.lock(id);
        }

        public boolean unlock(String val, int id) {
            Node node = nodesByVal.get(val);
            return node != null && node.unlock(id);
        }

        public boolean upgrade(String val, int id) {
            Node node = nodesByVal.get(val);
            return node != null && node.upgrade(id);
        }
    }

}



