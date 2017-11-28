public class Solution {
    public int[] wave(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if (i % 2 == 0) {
                if (A[i] < A[i+1]) {
                    swap(A, i, i+1);
                }
            } else {
                if (A[i] > A[i+1]) {
                    swap(A, i, i+1);
                }
            }
        }
        return A;
    }
    
    public void swap(int[] arr, int indexA, int indexB) {
        int temp = arr[indexB];
        arr[indexB] = arr[indexA];
        arr[indexA] = temp;
    }
}
