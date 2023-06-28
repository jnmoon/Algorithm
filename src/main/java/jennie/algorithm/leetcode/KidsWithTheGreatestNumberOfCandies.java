package jennie.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>(candies.length);
        int max = 0;

        for (int candy : candies) {
            if (candy > max) max = candy;
        }

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                answer.add(true);
            } else {
                answer.add(false);
            }
        }

        return answer;
    }
}
