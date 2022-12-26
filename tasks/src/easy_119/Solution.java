package easy_119;

import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] row = new Integer[rowIndex + 1];
        row[0] = 1;
        if (rowIndex >= 1) row[1] = 1;

        for (int i = 2; i <= rowIndex; i++) {
            int first = 1;
            for (int j = 1; j < i; j++) {
                int second = row[j];
                row[j] = first + second;
                first = second;
            }
            row[i] = 1;
        }
        return Arrays.asList(row);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> row = solution.getRow(4);
        System.out.println(row);
    }
}