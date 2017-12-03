public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        if (A.isEmpty()) {
            return 0;
        }
        String[] words = A.split(" ");
        if (words.length == 0) {
            return 0;
        }
        int j = words.length - 1;
        String str = words[j];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return count;
    }
}
