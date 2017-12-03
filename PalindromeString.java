public class Solution {
    public int isPalindrome(String A) {
        char[] charA = A.toCharArray();
        int first = 0;
        int last = A.length() - 1;
        while (first < last) {
            char firstChar = Character.toLowerCase(charA[first]);
            if (firstChar == ' ' || firstChar == '"' || firstChar == ',' || firstChar == ':') {
                first++;
                continue;
            }
            char lastChar = Character.toLowerCase(charA[last]);
            if (lastChar == ' ' || lastChar == '"' || lastChar == ',' || lastChar == ':') {
                last--;
                continue;
            }
            if (firstChar != lastChar) {
                return 0;
            }
            first++;
            last--;
        }
        return 1;
    }
}
