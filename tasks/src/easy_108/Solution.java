package easy_108;

class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return getTree(nums, 0, nums.length - 1);
    }

    private static TreeNode getTree(int[] nums, int i, int j) {
        if (j - i <= 1) {
            return new TreeNode(nums[i], null, i == j ? null : new TreeNode(nums[j]));
        }
        int mid = (i + j) / 2;

        return new TreeNode(nums[mid], getTree(nums, i, mid - 1), getTree(nums, mid + 1, j));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = solution.sortedArrayToBST(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(root);
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