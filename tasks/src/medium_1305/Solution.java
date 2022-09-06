package medium_1305;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result1 = new ArrayList<>();
        travel(root1, result1);

        List<Integer> result2 = new ArrayList<>();
        travel(root2, result2);

        merge(result1, result2);
        return result1;
    }

    private void merge(List<Integer> result1, List<Integer> result2) {

        int i = 0;

        for (Integer result : result2) {
            while (i < result1.size() && result1.get(i) < result) i++;
            result1.add(i, result);
        }
    }

    private void travel(TreeNode treeNode, List<Integer> result) {
        if (treeNode == null) return;

        travel(treeNode.left, result);

        result.add(treeNode.val);

        travel(treeNode.right, result);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

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