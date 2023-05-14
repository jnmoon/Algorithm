package jennie.algorithm.leetcode;

import java.util.Stack;

public class RemovingStarsFromAString {
    public String removeStars(String s) {
        Stack<String> stack = new Stack<>();
        String[] arr = s.split("");
        for (String str : arr) {
            if (str.equals("*")) {
                stack.pop();
            } else {
                stack.push(str);
            }
        }

        String result = "";
        for (String str : stack) result += str;
        return result;
    }
}
