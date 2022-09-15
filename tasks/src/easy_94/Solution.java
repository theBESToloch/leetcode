package easy_94;


import java.util.ArrayList;
import java.util.List;

/*
*       1
*       /\
*      3  5
*         /\
*         7 9
*
* [1] -> [1, 3] -> [1]
* []  -> [3]
*
* */

class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> travel = new ArrayList<>();
        if (root == null) return travel;

        //узлы где нужно проверить правую ветку
        TreeNode[] nodes = new TreeNode[101];
        int i = -1;

        while (root != null || i >= 0) {
            while (root != null) {
                i++;
                nodes[i] = root;
                root = root.left;
            }
            root = nodes[i];
            travel.add(root.val);
            root = root.right;
            i--;
        }
        return travel;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode t3 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2, t3, null);
        TreeNode t1 = new TreeNode(1, null, t2);

        System.out.println(solution.inorderTraversal(t1));

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