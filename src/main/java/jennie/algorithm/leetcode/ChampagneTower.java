package jennie.algorithm.leetcode;

public class ChampagneTower {
    public double champagneTower(int poured, int row, int glass) {
        double[][] dp = new double[row + 1][row + 1];
        dp[0][0] = poured;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                double remain = (dp[i][j] - 1.0) / 2.0;
                if (remain > 0) {
                    dp[i + 1][j] += remain;
                    dp[i + 1][j + 1] += remain;
                }
            }
        }

        return Math.min(1.0, dp[row][glass]);
    }
}
