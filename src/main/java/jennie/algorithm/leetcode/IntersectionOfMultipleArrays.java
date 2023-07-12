package jennie.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfMultipleArrays {
    public List<Integer> intersection(int[][] nums) {
        HashSet<Integer> common = new HashSet<>();

        for (int i : nums[0]) {
            common.add(i);
        }

        for (int i = 1; i < nums.length; i++) {
            HashSet<Integer> tmp = new HashSet<>();
            for (int j : nums[i]) {
                tmp.add(j);
            }
            common.retainAll(tmp);
        }

        List<Integer> answer = new ArrayList<>(common);
        Collections.sort(answer);
        return answer;
    }
}
