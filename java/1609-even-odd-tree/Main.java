// 1609. Even Odd Tree
// https://leetcode.com/problems/even-odd-tree/description/

class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null)
            return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int prevValue = level % 2 == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                if ((level % 2 == 0 && (current.val % 2 == 0 || current.val <= prevValue)) ||
                        (level % 2 != 0 && (current.val % 2 != 0 || current.val >= prevValue)))
                    return false;

                prevValue = current.val;

                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
            }

            level++;
        }

        return true;
    }
}