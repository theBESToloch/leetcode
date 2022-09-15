package easy_100;

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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == q) return true;

        if (p == null || q == null) {
            return false;
        }

        Queue<TreeNode> q1 = new LinkedList<>();
        q1.add(p);
        Queue<TreeNode> q2 = new LinkedList<>();
        q2.add(q);

        while (!q1.isEmpty()) {
            TreeNode t1 = q1.poll();
            TreeNode t2 = q2.poll();

            if (t1.val != t2.val) {
                return false;
            }
            if (t1.left != null && t2.left != null) {
                q1.add(t1.left);
                q2.add(t2.left);
            } else if (t1.left != t2.left) {
                return false;
            }
            if (t1.right != null && t2.right != null) {
                q1.add(t1.right);
                q2.add(t2.right);
            } else if (t1.right != t2.right) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode t3 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2, t3, null);
        TreeNode t1 = new TreeNode(1, null, t2);

        System.out.println(solution.isSameTree(t1, t1));
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