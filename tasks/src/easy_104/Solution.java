package easy_104;

import java.util.Deque;
import java.util.LinkedList;

class Solution {

    public int maxDepth(TreeNode root) {
        int currentDepth = 0;
        if (root == null) {
            return currentDepth;
        }

        int maxDepth = 1;
        Deque<TreeNode> q1 = new LinkedList<>();

        while (root != null) {
            while (root != null) {
                q1.push(root);
                root = root.left;
                currentDepth++;
            }

            if (currentDepth > maxDepth) {
                maxDepth = currentDepth;
            }

            root = q1.poll();
            //т.к. больше левой ноды нет, смотрим правую ноду
            if (root.right != null) {
                q1.push(root);
                root = root.right;
            } else {
                //ищем ближайшую непустую правую ноду
                TreeNode current = root;
                root = q1.poll();
                while (root != null) {
                    if (root.right != null && root.right != current) {
                        q1.push(root);
                        root = root.right;
                        currentDepth--;
                        break;
                    } else {
                        current = root;
                        currentDepth--;
                        root = q1.poll();
                    }
                }
            }
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode t5 = new TreeNode(3);
        TreeNode t4 = new TreeNode(2, null, t5);

        TreeNode t3 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2, t3, null);

        TreeNode t1 = new TreeNode(1, t4, t2);

        System.out.println(solution.maxDepth(t1));
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