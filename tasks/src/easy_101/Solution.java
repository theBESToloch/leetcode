package easy_101;

/*
 *
 * 1) сравниваем val
 * 2) если все ок, то сравниваем левую ветвь
 * 3) если все ок, то сравниваем правую ветвь
 *
 *
 *
 *
 *
 *
 */

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public boolean isSymmetric(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;

        if (left == null || right == null) {
            return left == right;
        }

        Queue<TreeNode> q1 = new LinkedList<>();
        q1.add(left);
        Queue<TreeNode> q2 = new LinkedList<>();
        q2.add(right);

        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode t1 = q1.poll();
            TreeNode t2 = q2.poll();

            if (t1.val != t2.val) return false;

            if (t1.left == null || t2.right == null) {
                if (t1.left != t2.right) return false;
            } else {
                q1.add(t1.left);
                q2.add(t2.right);
            }
            if (t1.right == null || t2.left == null) {
                if (t1.right != t2.left) return false;
            } else {
                q1.add(t1.right);
                q2.add(t2.left);
            }
        }

        return q1.isEmpty() && q2.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode t5 = new TreeNode(3);
        TreeNode t4 = new TreeNode(2, null, t5);

        TreeNode t3 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2, t3, null);

        TreeNode t1 = new TreeNode(1, t4, t2);

        System.out.println(solution.isSymmetric(t1));
    }

    public static class TreeNode {
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
}