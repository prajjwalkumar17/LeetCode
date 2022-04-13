import Tree.MaxInBinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//    static class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode() {
//        }
//
//        TreeNode(int val) {
//            this.val = val;
//        }
//    }

//        int[] nums = new int[]{-1,0,1,2,-1,-4};
//        TreeNode tree = new TreeNode(4);
//        tree.left = new TreeNode(2);
//        tree.left.left = new TreeNode(1);
//        tree.left.right = new TreeNode(3);
//        tree.right = new TreeNode(7);
//        tree.right.left = new TreeNode(6);
//        tree.right.right = new TreeNode(9);
        int[][] num1 = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(spiralOrder(3));


    }

    public static List<Integer> spiralOrder(int n) {
        List<Integer> res = new ArrayList<>();
        int top = 0, left = 0, right = n - 1, bottom = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                res.add(i + 1);
            top++;

            for (int i = top; i <= bottom; i++)
                res.add(i + n);
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    res.add(n + bottom + i);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(2 * n + bottom + top);
                }
                left++;
            }
        }
        return res;
    }


    public static void printArray(int[] nums) {
        for (int i : nums) {
            System.out.println(i);
        }
    }


}