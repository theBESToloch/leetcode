package easy_118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final List<Integer> FIRST = List.of(1);
    private static final List<Integer> SECOND = List.of(1, 1);

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        result.add(FIRST);
        if(numRows > 1) result.add(SECOND);

        List<Integer> prevRow = SECOND;
        for (int i = 3; i <= numRows; i++) {
            List<Integer> curRow = new ArrayList<>(i);
            curRow.add(1);
            for (int j = 1; j < i - 1; j ++){
                curRow.add(prevRow.get(j) + prevRow.get(j - 1));
            }
            curRow.add(1);
            result.add(curRow);
            prevRow = curRow;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> generate = solution.generate(6);
        System.out.println(generate);
    }
}