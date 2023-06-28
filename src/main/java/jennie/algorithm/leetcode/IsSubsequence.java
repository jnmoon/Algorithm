package jennie.algorithm.leetcode;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        char[] as = s.toCharArray();
        char[] at = t.toCharArray();

        int i = 0;
        int j = 0;
        while (i < as.length && j < at.length) {
            if (as[i] == at[j]) {
                i++;
            }
            j++;
        }

        return i == as.length;
    }
}
