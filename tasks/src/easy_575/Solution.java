package easy_575;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;

        Set<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }

        return Math.min(n / 2, set.size());
    }

    public static void main(String[] args) {
        Solution s = new Solution();

    }
}