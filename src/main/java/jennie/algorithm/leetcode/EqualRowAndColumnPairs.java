package jennie.algorithm.leetcode;

import java.util.HashMap;

class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> row = new HashMap<>();
        HashMap<String, Integer> col = new HashMap<>();
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            String tmp = "";
            for (int j = 0; j < grid.length; j++) {
                tmp = tmp + " " + grid[i][j];
            }
            row.put(tmp, row.getOrDefault(tmp, 0) + 1);

            tmp = "";
            for (int j = 0; j < grid.length; j++) {
                tmp = tmp + " " + grid[j][i];
            }
            col.put(tmp, col.getOrDefault(tmp, 0) + 1);
        }

        for (String key : row.keySet() ){
            if (col.containsKey(key)) {
                result += row.get(key) * col.get(key);
            }
        }

        return result;
    }
}