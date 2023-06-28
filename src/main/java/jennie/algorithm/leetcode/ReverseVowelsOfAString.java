package jennie.algorithm.leetcode;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        char[] answer = new char[s.length()];
        int i = 0;
        int j = arr.length - 1;

        while (i < arr.length) {
            if (!check(arr[i])) {
                answer[i] = arr[i];
                i++;
                continue;
            }

            if (!check(arr[j])) {
                j--;
                continue;
            }

            if (check(arr[i]) && check(arr[j])) {
                answer[i] = arr[j];
                i++;
                j--;
            }
        }

        return String.valueOf(answer);

    }

    private boolean check(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') return true;
        return false;
    }
}
