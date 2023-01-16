package easy_111;

class Solution {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return getMinDepth(root, 1, Integer.MAX_VALUE);
    }

    private int getMinDepth(TreeNode root, int curDepth, int minDepth) {
        if (curDepth > minDepth) {
            return minDepth;
        }
        if (root.left == null && root.right == null) {
            return curDepth;
        }
        if (root.left != null) {
            minDepth = getMinDepth(root.left, curDepth + 1, minDepth);
        }
        if (root.right != null) {
            minDepth = getMinDepth(root.right, curDepth + 1, minDepth);
        }
        return minDepth;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode t5 = new TreeNode(3);
        TreeNode t4 = new TreeNode(2, null, t5);

        TreeNode t3 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2, t3, null);

        TreeNode t1 = new TreeNode(1, t4, t2);

        System.out.println(solution.minDepth(t1));
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