public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    if (a.isEmpty()) {
	        return -1;
	    }
	    HashSet<Integer> hSet = new HashSet<Integer>();
	    for (Integer i : a) {
	        if (hSet.contains(i)) {
	            return i;
	        } else {
	            hSet.add(i);
	        }
	    }
	    return -1;
	}
}
