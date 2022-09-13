package easy_88;

import java.util.Arrays;

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int cur = m + n - 1;
        m--;
        n--;
        for (; cur >= 0; cur--) {
            if (m < 0 || n < 0) break;
            if (nums1[m] > nums2[n]) {
                nums1[cur] = nums1[m];
                m--;
            } else {
                nums1[cur] = nums2[n];
                n--;
            }
        }

        for (; n >= 0; n--) {
            nums1[cur] = nums2[n];
            n--;
            cur--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints1 = {1, 2, 3, 4, 0, 0, 0};
        int[] ints2 = {3, 4, 5};
        solution.merge(ints1, 4, ints2, 3);
        System.out.println(Arrays.toString(ints1));
    }
}