// 872. Leaf-Similar Trees
// https://leetcode.com/problems/leaf-similar-trees/

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafSequence1 = new ArrayList<>();
        List<Integer> leafSequence2 = new ArrayList<>();

        getSeq(root1, leafSequence1);
        getSeq(root2, leafSequence2);

        return leafSequence1.equals(leafSequence2);
    }

    private void getSeq(TreeNode node, List<Integer> leafSequence) {
        if (node == null) return;

        if (node.left == null && node.right == null) {
            leafSequence.add(node.val);
            return;
        }

        getSeq(node.left, leafSequence);
        getSeq(node.right, leafSequence);
    }
}