package easy_58;

class Solution {
    public int lengthOfLastWord(String s) {
        int length = s.length();
        int end = length;

        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        for (int i = end - 1; i >= 0; i--) {
            if(s.charAt(i) == ' '){
                return end - i;
            }
        }
        return end + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("a"));
        System.out.println(solution.lengthOfLastWord(" a"));
        System.out.println(solution.lengthOfLastWord("day"));
        System.out.println(solution.lengthOfLastWord("Hello World"));
        System.out.println(solution.lengthOfLastWord("Hello World  "));

    }
}