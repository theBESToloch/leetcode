package easy_110;

class Solution {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = getDepth(root.left, 1);
        if (left == -1) return false;
        int right = getDepth(root.right, 1);
        if (right == -1) return false;
        return Math.abs(left - right) <= 1;
    }

    private static int getDepth(TreeNode cur, int curDepth) {
        if (cur == null) {
            return curDepth - 1;
        }
        int leftDepth = getDepth(cur.left, curDepth + 1);
        if (leftDepth == -1) return -1;
        int rightDepth = getDepth(cur.right, curDepth + 1);
        if (rightDepth == -1) return -1;

        return Math.abs(leftDepth - rightDepth) <= 1 ? Math.max(leftDepth, rightDepth) : -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isBalanced(new TreeNode(0)));
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