// 513. Find Bottom Left Tree Value
// https://leetcode.com/problems/find-bottom-left-tree-value/
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            throw new IllegalArgumentException("Root cannot be null");
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode leftmost = root;

        while (!queue.isEmpty()) {
            int size = queue.size();
            leftmost = queue.peek();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
            }
        }

        return leftmost.val;
    }
}