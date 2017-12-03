public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int size = A.length;
        int max = Integer.MIN_VALUE, maxEnd = 0;
        for (int i = 0; i < size; i++) {
            maxEnd = maxEnd + A[i];
            if (max < maxEnd) {
                max = maxEnd;
            }
            if (maxEnd < 0) {
                maxEnd = 0;
            }
        }
        return max;
    }
}
