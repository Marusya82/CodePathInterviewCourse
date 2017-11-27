public class Solution {
	public String reverseWords(String a) {
	    String[] words = a.split(" ");
	    StringBuffer buffer = new StringBuffer();
	    for (int i = words.length - 1; i >= 0; i--) {
	        buffer.append(words[i]);
	        if (i != 0) {
	            buffer.append(" ");
	        }
	    }
	    return buffer.toString();
	}
}
