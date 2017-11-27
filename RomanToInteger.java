public class Solution {
    public int romanToInt(String A) {
        char[] charA = A.toCharArray();
        boolean specialCaseI = false;
        boolean specialCaseX = false;
        boolean specialCaseC = false;
        int count = 0;
        for (int i = charA.length - 1; i >= 0; i--) {
            if (charA[i] == 'X') {
                specialCaseI = true;
                if (specialCaseX) {
                    count -= 10;
                } else {
                    count += 10;
                }
                specialCaseX = false;
            } else if (charA[i] == 'V') {
                specialCaseI = true;
                count += 5;
            } else if (charA[i] == 'I') {
                if (specialCaseI) {
                    count -= 1;
                } else {
                    count += 1;
                }
                specialCaseI = false;
            } else if (charA[i] == 'L') {
                specialCaseX = true;
                count += 50;
            } else if (charA[i] == 'C') {
                specialCaseX = true;
                if (specialCaseC) {
                    count -= 100;
                } else {
                    count += 100;
                }
                specialCaseC = false;
            } else if (charA[i] == 'D') {
                specialCaseC = true;
                count += 500;
            } else if (charA[i] == 'M') {
                specialCaseC = true;
                count += 1000;
            }
        }
        return count;
    }
}
