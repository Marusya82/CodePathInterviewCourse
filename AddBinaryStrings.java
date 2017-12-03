public class Solution {
    public String addBinary(String A, String B) {
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();
        Stack st = new Stack();
        String result = "";
        int indexA = charA.length - 1;
        int indexB = charB.length - 1;
        int loop = (indexA >= indexB) ? indexA : indexB;
        int addition = 0, a, b;
        for (int i = loop; i >= 0; i--) {
            a = (indexA >= 0) ? Character.getNumericValue(charA[indexA]) : 0;
            b = (indexB >= 0) ? Character.getNumericValue(charB[indexB]) : 0;
            int check = a + b + addition;
            if (check == 2) {
                st.push(0);
                addition = 1;
            } else if (check == 3) {
                st.push(1);
                addition = 1;
            } else {
                st.push(check);
                addition = 0;
            }
            indexA -= 1;
            indexB -= 1;
        }
        if (addition == 1) {
            st.push(addition);
        }
        while(!st.isEmpty()) {
            result += st.pop().toString();
        }
        return result;
    }
}
