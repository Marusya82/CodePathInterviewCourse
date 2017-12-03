public class Solution {
    public int[] getRow(int A) {
        int[][] result = new int[A+1][A+1];
        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = result[i-1][j] + result[i-1][j-1];
                }
            }
        }
        return result[A];
    }
}
