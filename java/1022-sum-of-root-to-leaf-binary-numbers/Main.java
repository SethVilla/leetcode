// 1022. Sum of Root To Leaf Binary Numbers
// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeafHelper(root, 0);
    }

    private int sumRootToLeafHelper(TreeNode node, int currentSum) {
        if (node == null) return 0;

        // cast binary to int, but construct the binary rep by shifting and ORing
        int newSum = (currentSum << 1) | node.val;

        if (node.left == null && node.right == null) {
            return newSum;
        }

        int leftSum = sumRootToLeafHelper(node.left, newSum);
        int rightSum = sumRootToLeafHelper(node.right, newSum);

        return leftSum + rightSum;
    }
}