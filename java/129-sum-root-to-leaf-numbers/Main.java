// 129. Sum Root to Leaf Numbers
// https://leetcode.com/problems/sum-root-to-leaf-numbers/description/?envType=daily-question&envId=2024-04-15

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
    public int sumNumbers(TreeNode root) {
        return sumNumbersHelper(root, 0);
    }

    private int sumNumbersHelper(TreeNode node, int currentSum) {

        // base case
        if (node == null) return 0;

        // need 10 to account for digit placement
        int newSum = currentSum * 10 + node.val;

        if (node.left == null && node.right == null) {
            return newSum;
        }

        int leftSum = sumNumbersHelper(node.left, newSum);
        int rightSum = sumNumbersHelper(node.right, newSum);

        return leftSum + rightSum;
    }
}