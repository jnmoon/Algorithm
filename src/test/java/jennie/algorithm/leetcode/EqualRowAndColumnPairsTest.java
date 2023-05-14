package jennie.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EqualRowAndColumnPairsTest {

    EqualRowAndColumnPairs equalRowAndColumnPairs = new EqualRowAndColumnPairs();

    @Test
    void case1() {
        int[][] input = new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        int result = equalRowAndColumnPairs.equalPairs(input);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void case2() {
        int[][] input = new int[][]{{11, 1}, {1, 11}};
        int result = equalRowAndColumnPairs.equalPairs(input);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void case3() {
        int[][] input = new int[][]{{13, 13}, {13, 13}};
        int result = equalRowAndColumnPairs.equalPairs(input);
        assertThat(result).isEqualTo(4);
    }
}