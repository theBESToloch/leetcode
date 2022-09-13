package easy_70;

//5:
/*
* 1 1 1 1 1
* 1 1 1 2
* 1 1 2 1
* 1 2 1 1
* 2 1 1 1
* 1 2 2
* 2 1 2
* 2 2 1
*/

//6:
/*
 * 1 1 1 1 1 1
 * 1 1 1 1 2
 * 1 1 1 2 1
 * 1 1 2 1 1
 * 1 2 1 1 1
 * 2 1 1 1 1
 * 1 1 2 2
 * 1 2 1 2
 * 1 2 2 1
 * 2 1 1 2
 * 2 1 2 1
 * 2 2 1 1
 * 2 2 2
 */

class Solution {
    public int climbStairs(int n) {
        int stepOne = 1, stepTwo = 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = stepOne + stepTwo;
            stepTwo = stepOne;
            stepOne = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        for (int i = 0; i < 45; i++) {
            System.out.println(i + " = " + solution.climbStairs(i));
        }
    }
}