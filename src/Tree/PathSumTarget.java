package Tree;

public class PathSumTarget {
/*    Given the root of a binary tree and an integer targetSum,
            return true if the tree has a root-to-leaf path such that adding up
    all the values along the path equals targetSum.

    A leaf is a node with no children.
    Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
    Output: true
    Explanation: The root-to-leaf path with the target sum is shown.*/

//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if(root==null)return false;
//
//        Deque<TreeNode> curr_node=new LinkedList<>();
//        Deque<Integer> curr_val=new LinkedList<>();
//
//        curr_node.add(root);
//        curr_val.add(targetSum-root.val);
//        while(!curr_node.isEmpty()){
//            TreeNode currnode=curr_node.pop();
//            int currsum=curr_val.pop();
//            if(currnode.left==null && currnode.right==null && currsum==0)
//                return true;
//
//            if(currnode.left!=null){
//                curr_node.add(currnode.left);
//                curr_val.add(currsum-currnode.left.val);
//
//            }
//
//            if(currnode.right!=null){
//                curr_node.add(currnode.right);
//                curr_val.add(currsum-currnode.right.val);
//
//            }
//        }
//        return false;
//
//    }
}
