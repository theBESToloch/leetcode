package easy_27;

class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int j = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 5, 5, 5, 1};
        System.out.println(solution.removeElement(ints, 5));
    }
}