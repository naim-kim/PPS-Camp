// 118. Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();

        if (numRows == 0) {
            return output;
        }
        if (numRows == 1) { // first row == 1
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            output.add(firstRow);
            return output;
        }

        // Recursive call to generate previous rows + get last row from output
        output = generate(numRows - 1);
        List<Integer> prevRow = output.get(numRows - 2);
        List<Integer> currentRow = new ArrayList<>();

        currentRow.add(1); // first num == 1

        for (int i = 1; i < numRows - 1; i++) { // numRows - 2
            currentRow.add(prevRow.get(i - 1) + prevRow.get(i));
        }

        currentRow.add(1); // last num == 1
        output.add(currentRow);

        return output;
    }
}