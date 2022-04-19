package BinarySearchTree;
//897 Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the
//        root of the tree, and every node has no left child and only one right child.
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

    //TOdo to have a look how the recurssion works here


//
//    //                subsets(num1);
//    public static List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        subsets(nums, new ArrayList<Integer>(), 0, res);
//        return res;
//    }
//    public static void subsets(int[] nums, List<Integer> curr, int i, List<List<Integer>> res) {
//        if (i == nums.length) {
//            res.add(new ArrayList<>(curr)); // copy of curr is being added
//            return;
//        }
//        System.out.println(curr+"/////////////0");
//        curr.add(nums[i]);
//        System.out.println(curr+"/////////////1");
//        subsets(nums,curr,i+1,res);
//        System.out.println(curr+"/////////////2");
//        curr.remove(curr.size()-1);
//        System.out.println(curr+"/////////////3");
//
//        subsets(nums, curr, i + 1, res);
//        System.out.println(curr+"/////////////4");
//    }
//
}