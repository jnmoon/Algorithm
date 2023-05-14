package jennie.algorithm.leetcode;

import java.util.HashMap;

class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> row = new HashMap<>();
        HashMap<String, Integer> col = new HashMap<>();
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            String strRow = "";
            String strCol = "";
            for (int j = 0; j < grid.length; j++) {
                strRow = strRow + " " + grid[i][j];
                strCol = strCol + " " + grid[j][i];
            }
            row.put(strRow, row.getOrDefault(strRow, 0) + 1);
            col.put(strCol, col.getOrDefault(strCol, 0) + 1);
        }

        for (String key : row.keySet() ){
            if (col.containsKey(key)) {
                result += row.get(key) * col.get(key);
            }
        }

        return result;
    }
}