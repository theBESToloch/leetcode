package easy_13;

/*
    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
*/
class Solution {
    public int romanToInt(String s) {
        int i = 0;
        int count = 0;

        int length = s.length();

        while (i < length) {
            char next = i + 1 < length ? s.charAt(i + 1) : 'a';
            switch (s.charAt(i)) {
                case 'I':
                    if (next == 'V') {
                        count += 4;
                        i += 2;
                    } else if (next == 'X') {
                        count += 9;
                        i += 2;
                    } else {
                        count += 1;
                        i++;
                    }
                    break;
                case 'V':
                    count += 5;
                    i++;
                    break;
                case 'X':
                    if (next == 'L') {
                        count += 40;
                        i += 2;
                    } else if (next == 'C') {
                        count += 90;
                        i += 2;
                    } else {
                        count += 10;
                        i++;
                    }
                    break;
                case 'L':
                    count += 50;
                    i++;
                    break;
                case 'C':
                    if (next == 'D') {
                        count += 400;
                        i += 2;
                    } else if (next == 'M') {
                        count += 900;
                        i += 2;
                    } else {
                        count += 100;
                        i++;
                    }
                    break;
                case 'D':
                    count += 500;
                    i++;
                    break;
                case 'M':
                    count += 1000;
                    i++;
                    break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.romanToInt("III"));
        System.out.println(s.romanToInt("LVIII"));
        System.out.println(s.romanToInt("MCMXCIV"));
    }
}