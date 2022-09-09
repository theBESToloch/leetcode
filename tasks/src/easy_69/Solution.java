package easy_69;


class Solution {
    public int mySqrt(int x) {
        int min = 0;
        int max = 46340;

        int cur = max / 2;

        while (true) {
            int sqr = cur * cur;
            if (x > sqr) {
                min += (max - min) / 2;
            } else if (x < sqr) {
                max -= (max - min) / 2;
            } else {
                return cur;
            }
            if (max - min <= 1) {
                return (max * max) <= x ? max : min;
            };
            cur = min + (max - min) / 2;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.mySqrt(0));
        System.out.println(solution.mySqrt(10));
        System.out.println(solution.mySqrt(46340 * 46340));
        System.out.println(solution.mySqrt(9));
        System.out.println(solution.mySqrt(81));
    }
}