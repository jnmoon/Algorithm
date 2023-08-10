package jennie.algorithm.leetcode;

import java.util.Arrays;

public class MaximumBagsWithFullCapacityOfRocks {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for (int i = 0; i < capacity.length; i++) {
            capacity[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(capacity);

        int answer = 0;
        for (int i = 0; i < capacity.length && additionalRocks > 0; i++) {
            if (capacity[i] == 0) {
                answer++;
            } else if (capacity[i] <= additionalRocks) {
                additionalRocks -= capacity[i];
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}
