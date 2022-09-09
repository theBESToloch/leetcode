package easy_66;

import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;

        int i = length - 1;
        int cur = digits[i] + 1;

        digits[i] = cur % 10;
        cur = cur / 10;

        if (cur == 0) {
            return digits;
        }

        while (cur > 0) {
            i--;
            if (i >= 0) {
                cur = digits[i] + cur;
                digits[i] = cur % 10;
                cur = cur / 10;
            } else {
                int[] arr = new int[length +1];
                System.arraycopy(digits, 0, arr, 1, length);
                arr[0] = 1;
                return arr;
                //rerange array, copy and put first number - 1
            }
        }
        return digits;
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