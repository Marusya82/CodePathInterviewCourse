public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        if (B.length() > A.length()) {
            return -1;
        }
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();
        for (int i = 0; i < charA.length; i++) {
            if (charA[i] != charB[0]) {
                continue;
            } else {
                for (int j = 0; j < charB.length; j++) {
                    if ((i+j) >= charA.length) {
                        break;
                    }
                    if (charA[i+j] == charB[j]) {
                        if (j == charB.length - 1) {
                            return i;
                        }
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }
        return -1;
    }
}
