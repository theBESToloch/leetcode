package easy_20;

class Solution {
    public boolean isValid(String s) {
        int j = 1;
        byte[] mask = new byte[5001];

        int length = s.length();
        for (int i = 0; i < length; i++) {
            switch (s.charAt(i)) {
                case '(':
                    mask[j] = 1;
                    j++;
                    break;
                case '{':
                    mask[j] = 2;
                    j++;
                    break;
                case '[':
                    mask[j] = 3;
                    j++;
                    break;
                case ')':
                    if (mask[j - 1] != 1) return false;
                    j--;
                    break;
                case '}':
                    if (mask[j - 1] != 2) return false;
                    j--;
                    break;
                case ']':
                    if (mask[j - 1] != 3) return false;
                    j--;
                    break;
            }
            if(j == 5001) return false;
        }
        return j == 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("([)]"));
    }

}
