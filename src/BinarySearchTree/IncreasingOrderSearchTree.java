package BinarySearchTree;

public class IncreasingOrderSearchTree {
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

//    class Solution {
//        private TreeNode newRoot = new TreeNode(0);
//        private TreeNode tracker = newRoot;
//        public TreeNode increasingBST(TreeNode root) {
//
//            if(root == null)
//                return root;
//
//            increasingBST(root.left);
//            tracker.right = root;
//            tracker = tracker.right;
//            root.left = null;
//            increasingBST(root.right);
//            return newRoot.right;
//        }
//    }
}