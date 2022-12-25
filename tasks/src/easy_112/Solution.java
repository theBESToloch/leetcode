package easy_112;

class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        return hasPathSum(root, 0, targetSum);
    }

    private static boolean hasPathSum(TreeNode root, int curSum, int targetSum) {
        if (root == null) return curSum == targetSum;

        curSum = root.val + curSum;

        if (curSum == targetSum && root.left == null && root.right == null) return true;

        return root.left != null && hasPathSum(root.left, curSum, targetSum)
                || root.right != null && hasPathSum(root.right, curSum, targetSum);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode l1 = new TreeNode(1);
        TreeNode treeNode = new TreeNode(1, l1, null);
        System.out.println(solution.hasPathSum(treeNode, 2));
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

        @Override
        public String toString() {
            return "TreeNode{\n" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}