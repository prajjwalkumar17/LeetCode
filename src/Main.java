import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] num1 = new int[]{11, 22, 13, 84};


        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(7);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
        increasingBST(root);
    }


    public static void increasingBST(TreeNode root) {
        if (root == null) return;
        increasingBST(root.left);
        System.out.println(root.val);

    }


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
}