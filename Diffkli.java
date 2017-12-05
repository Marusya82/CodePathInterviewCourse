public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int diffPossible(final int[] A, int B) {
        if (A.length == 0 || A.length == 1) {
            return 0;
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j < A.length; j++) {
                int diff = Math.abs(A[j] - A[i]);
                if (diff == B && i != j) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
