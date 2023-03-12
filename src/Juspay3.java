import java.util.*;

public class Juspay3 {

    class TreeNode {
        String name;
        int lockedBy;
        boolean isLocked;
        List<TreeNode> childs;
        TreeNode parent;
        Set<TreeNode> lockedDescendents;

        TreeNode(String nm, TreeNode par) {
            name = nm;
            lockedBy = -1;
            parent = par;
            isLocked = false;
            childs = new ArrayList<>();
        }

        void addChild(List<String> a) {
            for (String nm : a) {
                childs.add(new TreeNode(nm, this));
            }
        }
    }

    class MAryTree {
        TreeNode root;
        Map<String, TreeNode> nameToTreeNodeMapping;

        MAryTree(String name) {
            root = new TreeNode(name, null);
            nameToTreeNodeMapping = new HashMap<>();
        }

        void makeMArtTree(List<String> a, int m) {
            Queue<TreeNode> q = new LinkedList<>();
            int k = 1, i, n = a.size();
            q.offer(root);
            while (!q.isEmpty()) {
                TreeNode r = q.poll();
                nameToTreeNodeMapping.put(r.name, r);
                List<String> b = new ArrayList<>();
                for (i = k; i < Math.min(n, k + m); i++) {
                    b.add(a.get(i));
                }
                r.addChild(b);
                for (TreeNode child : r.childs) {
                    q.offer(child);
                }
                k = i;
            }
        }

        void updateParents(TreeNode r, TreeNode curr) {
            while (r != null) {
                r.lockedDescendents.add(curr);
                r = r.parent;
            }
        }

        boolean lock(String name, int id) {
            TreeNode r = nameToTreeNodeMapping.get(name);
            if (r.isLocked || !r.lockedDescendents.isEmpty()) {
                return false;
            }
            TreeNode par = r.parent;
            while (par != null) {
                if (par.isLocked) {
                    return false;
                }
                par = par.parent;
            }
            updateParents(r.parent, r);
            r.isLocked = true;
            r.lockedBy = id;
            return true;
        }

        boolean unlock(String name, int id) {
            TreeNode r = nameToTreeNodeMapping.get(name);
            if (!r.isLocked || r.lockedBy != id) {
                return false;
            }
            TreeNode par = r.parent;
            while (par != null) {
                par.lockedDescendents.remove(r);
                par = par.parent;
            }
            r.isLocked = false;
            r.lockedBy = -1;
            return true;
        }

        boolean upgradeLock(String name, int id) {
            TreeNode r = nameToTreeNodeMapping.get(name);
            if (r.isLocked || r.lockedDescendents.isEmpty()) {
                return false;
            }
            for (TreeNode ld : r.lockedDescendents) {
                if (ld.lockedBy != id) {
                    return false;
                }
            }
            TreeNode par = r.parent;
            while (par != null) {
                if (par.isLocked) {
                    return false;
                }
                par = par.parent;
            }
            Set<TreeNode> stt = new HashSet<>(r.lockedDescendents);
            for (TreeNode ld : stt) {
                unlock(ld.name, id);
            }
            lock(name, id);
            return true;
        }
    }
}
