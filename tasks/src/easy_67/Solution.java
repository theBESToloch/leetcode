package easy_67;


class Solution {
    public String addBinary(String a, String b) {
        int la = a.length();
        int lb = b.length();
        int min = Math.min(la, lb);
        int max = Math.max(la, lb);
        String maxStr = la > lb ? a : b;

        StringBuilder sb = new StringBuilder();
        boolean over = false;

        for (int i = 1; i <= min; i++) {
            char ca = a.charAt(la - i);
            char cb = b.charAt(lb - i);
            if (ca == '1' && cb == '1') {
                sb.append(over ? '1' : '0');
                over = true;
            } else if (ca == '0' && cb == '0') {
                sb.append(over ? '1' : '0');
                over = false;
            } else {
                sb.append(over ? '0' : '1');
            }
        }

        for (int i = max - min - 1; i >= 0; i--) {
            if (maxStr.charAt(i) == '1') {
                sb.append(over ? '0' : '1');
            } else {
                sb.append(over ? '1' : '0');
                over = false;
            }
        }

        if(over){
            sb.append('1');
        }

        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("0", "0"));
        System.out.println(solution.addBinary("11111", "11111"));
        System.out.println(solution.addBinary("11", "11111"));
        System.out.println(solution.addBinary("11", "1"));
    }
}