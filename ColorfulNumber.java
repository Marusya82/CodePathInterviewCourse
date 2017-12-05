public class Solution {
    public int colorful(int A) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        String s = Integer.toString(A);
        int max = s.length() - 1;
        int[] nums = new int[s.length()];
        for (int i = 0; i < s.length(); i++){
            nums[i] = s.charAt(i) - '0';
        }

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j <= max && i+j < nums.length; j++) {
                product *= nums[i+j];
                if (table.get(product) != null)
                    return 0;
                else {
                    table.put(product, 1);
                }
            }
        }
        return 1;
	}
}
