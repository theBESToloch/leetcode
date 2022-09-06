package easy_14;

import java.nio.charset.StandardCharsets;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        byte[] first = strs[0].getBytes();
        int maxPrefix = first.length;

        for (int i = 1; i < strs.length; i++) {
            String second = strs[i];

            maxPrefix = Math.min(second.length(), maxPrefix);
            for (int j = 0; j < maxPrefix; j++) {
                if (first[j] != second.charAt(j)) {
                    maxPrefix = j;
                    break;
                }
            }
        }

        return new String(first, 0, maxPrefix);
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(s.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(s.longestCommonPrefix(new String[]{"ab", "a"}));
    }
}