package medium_814;

class Solution {
    public TreeNode pruneTree(TreeNode root) {
        TreeNode left = root.left;
        if (left != null) {
            left = pruneTree(left);
        }

        TreeNode right = root.right;
        if (right != null) {
            right = pruneTree(right);
        }

        if (left == null && right == null && root.val == 0) {
            return null;
        }

        root.left = left;
        root.right = right;

        return root;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(0);
        TreeNode t3 = new TreeNode(1);
        TreeNode t4 = new TreeNode(0);
        TreeNode t5 = new TreeNode(0);
        TreeNode t6 = new TreeNode(0);
        TreeNode t7 = new TreeNode(1);

        t1.left = t2;
        t1.right = t3;

        t2.left = t4;
        t2.right = t5;

        t3.left = t6;
        t3.right = t7;

        Solution solution = new Solution();
        TreeNode treeNode = solution.pruneTree(t1);

        System.out.println("fdsdfs");
    }

    public static class TreeNode {
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
