package jennie.algorithm.leetcode;

import java.util.Arrays;

public class MaximumConsecutiveFloorsWithoutSpecialFloors {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int lgth = special.length;
        int max = Math.max(special[0] - bottom, top - special[lgth - 1]);
        for (int i = 1; i < lgth; i++) {
            max = Math.max(max, special[i] - special[i - 1] - 1);
        }
        return max;
    }
}
