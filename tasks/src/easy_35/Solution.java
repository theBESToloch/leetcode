package easy_35;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int i = length / 2;

        int start = 0;
        int end = length;

        while (true) {
            int num = nums[i];
            if (target < num) {
                end = i;
            } else if (target > num) {
                start = i;
            } else {
                return i;
            }

            i = (end + start) / 2;
            if (end - start < 2) {
                return target <= nums[start] ? start : end;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {1, 2, 3, 4, 6, 7, 8, 9};
        System.out.println(solution.searchInsert(new int[]{1}, 0));
        System.out.println(solution.searchInsert(new int[]{1}, 0));
        System.out.println(solution.searchInsert(ints, 0));
        System.out.println(solution.searchInsert(ints, 5));
        System.out.println(solution.searchInsert(ints, 10));
    }
}