package jennie.algorithm.leetcode;

public class CanPlaceFlowers {
    int[] plots;

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        plots = flowerbed;

        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if (check(i)) {
                flowerbed[i] = 1;
                n--;
            }
        }

        return n <= 0 ? true : false;
    }

    private boolean check(int idx) {
        if (plots[idx] == 1) return false;
        if (idx - 1 >= 0 && plots[idx - 1] == 1) return false;
        if (idx + 1 < plots.length && plots[idx + 1] == 1) return false;
        return true;
    }
}
