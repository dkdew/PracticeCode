package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();

	}
	
	public int findLongestSubstring(String s){
		 int n = s.length(), ans = 0;
	        Map<Character, Integer> map = new HashMap<Character, Integer>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	                i = Math.max(map.get(s.charAt(j)), i);
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	}

}
