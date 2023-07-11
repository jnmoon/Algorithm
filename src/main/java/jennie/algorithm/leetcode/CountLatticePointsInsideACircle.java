package jennie.algorithm.leetcode;

import java.util.HashSet;

public class CountLatticePointsInsideACircle {
    public int countLatticePoints(int[][] circles) {
        HashSet<String> set = new HashSet<>();

        for (int[] circle : circles) {
            int x = circle[0];
            int y = circle[1];
            int r = circle[2];

            for (int i = x - r; i <= x + r; i++) {
                for (int j = y - r; j <= y + r; j++) {
                    double a = Math.pow(x - i, 2);
                    double b = Math.pow(y - j, 2);
                    double c = Math.sqrt(a + b);
                    if (c <= r) set.add(i + "," + j);
                }
            }
        }

        return set.size();
    }
}
