package easy_66;

import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;

        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] arr = new int[length + 1];
        arr[0] = 1;
        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{0})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9, 9, 9, 9})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{1, 0})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{8, 7, 3, 4})));
    }
}