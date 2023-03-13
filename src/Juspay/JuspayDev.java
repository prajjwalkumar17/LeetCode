package Juspay;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class JuspayDev {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int nodeCount = scanner.nextInt();
        int treeOrder = scanner.nextInt();
        int queryCount = scanner.nextInt();
        scanner.nextLine();
        Map<String, TreeNode> treeNodeMap = buildTree(scanner, nodeCount, treeOrder);
        for (int i = 0; i < queryCount; i++) {
            String[] input = scanner.nextLine().split(" ");
            TreeNode treeNode = treeNodeMap.get(input[1]);
            String userId = input[2];
            switch (input[0]) {
                case "1" -> System.out.println("Lock " + treeNode.lock(userId));
                case "2" -> System.out.println("Unlock " + treeNode.unlock(userId));
                case "3" -> System.out.println("Upgrade " + treeNode.upgrade(userId));
                default -> {
                }
            }
        }
    }

    private static Map<String, TreeNode> buildTree(Scanner scanner, int nodeCount, int treeOrder) {
        TreeNode parent = null;
        TreeNode root = null;
        Queue<TreeNode> queue = new LinkedList<>();
        Map<String, TreeNode> treeNodeMap = new HashMap<>();
        for (int i = 0; i < nodeCount; i++) {
            String name = scanner.nextLine();
            TreeNode newNode = new TreeNode(name, parent);
            treeNodeMap.put(name, newNode);
            if (parent == null) {
                root = newNode;
                parent = newNode;
            } else {
                if (!parent.isFull(treeOrder)) {
                    queue.add(newNode);
                } else {
                    parent = queue.remove();
                }
                parent.addChild(newNode);
            }
        }
        return treeNodeMap;
    }
}

class TreeNode {

    String name;
    TreeNode parent;
    List<TreeNode> children;
    private String lockedByUserId;
    private ReadWriteLock readWritelock = new ReentrantReadWriteLock();
    private Lock writeLock = readWritelock.writeLock();
    private Lock readLock = readWritelock.readLock();

    public TreeNode(String name, TreeNode parent) {
        this.name = name;
        this.children = new ArrayList<>();
        this.parent = parent;
        this.lockedByUserId = null;
    }

    public boolean isFull(int order) {
        return this.children.size() == order;
    }

    public void addChild(TreeNode treeNode) {
        this.children.add(treeNode);
    }

    public boolean lock(String userId) {
        // cannot be locked if it has a locked ancestor or descendant
        if (!this.isLocked() && !this.hasLockedAncestor() && !this.hasLockedDescendants()) {
            this.lockNode(userId);
            return true;
        }
        return false;
    }

    public boolean unlock(String userId) {
        // possible if already locked and locked by same Id
        if (!this.isLocked() && this.getNodeLockedBy() == userId) {
            this.unlockNode();
            return true;
        }
        return false;
    }

    public boolean upgrade(String userId) {
        // cannot be upgraded if already locked or has a locked ancestor
        // if upgrade happens all the locked descendant are unlocked
        if (!this.isLocked() && !hasLockedAncestor() && hasLockedDescendants()) {
            this.unlockDescendants();
            this.lockNode(userId);
            return true;
        }
        return false;
    }

    private boolean unlockDescendants() {
        this.unlockNode();
        for (TreeNode child : this.children) {
            if (!child.unlockDescendants()) {
                return false;
            }
        }
        return true;
    }

    private boolean hasLockedAncestor() {
        return parent != null && (parent.isLocked() || parent.hasLockedAncestor());
    }

    private boolean hasLockedDescendants() {
        for (TreeNode child : this.children) {
            if (child.isLocked() || child.hasLockedDescendants()) {
                return true;
            }
        }
        return false;
    }

    private boolean isLocked() {
        try {
            this.readLock.lock();
            return this.lockedByUserId != null;
        } finally {
            this.readLock.unlock();
        }
    }

    private String getNodeLockedBy() {
        try {
            this.readLock.lock();
            return this.lockedByUserId;
        } finally {
            this.readLock.unlock();
        }
    }

    private void lockNode(String userId) {
        try {
            this.writeLock.lock();
            this.lockedByUserId = userId;
        } finally {
            this.writeLock.unlock();
        }
    }

    private void unlockNode() {
        try {
            this.writeLock.lock();
            this.lockedByUserId = null;
        } finally {
            this.writeLock.unlock();
        }
    }
}