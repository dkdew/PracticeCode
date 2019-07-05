
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.*;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isAnagram("abc","cba")){
			System.out.println("String is anagram");
		}
		else{
			System.out.println("String is not anagram");
		}
	}
	
	public static boolean isAnagramSorting(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		char char1[] = str1.toCharArray();
		char char2[] = str2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		for(int i = 0; i < char1.length; i++){
			if(char1[i] != char2[i]){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isAnagram(String s, String t) {
	    if (s.length() != t.length()) {
	        return false;
	    }
	    int[] counter = new int[26];
	    for (int i = 0; i < s.length(); i++) {
	        counter[s.charAt(i) - 'a']++;
	        counter[t.charAt(i) - 'a']--;
	    }
	    for (int count : counter) {
	        if (count != 0) {
	            return false;
	        }
	    }
	    return true;
	}

}
