package string;

import java.util.Arrays;

public class Reverse {

	public static void main(String args[]){
		System.out.println(reverseRecursiveHelper("dinesh"));
	}
	
	public static String reverseIterative(String str){
		int start = 0;
		int end = str.length()-1;
		char ar[] = str.toCharArray();
		while(start<end){
			char c = ar[start];
			ar[start] = ar[end];
			ar[end] = c;
			start ++;
			end --;
		}
		str = Arrays.toString(ar);
		return str;
	}
	public static String reverseRecursiveHelper(String str){
		char ar[] = str.toCharArray();
		ar = reverseRecursive(ar, 0, ar.length-1);
		return Arrays.toString(ar);
	}
	
	public static char[] reverseRecursive(char ar[], int start, int end){
		if(start<end){
			char c = ar[start];
			ar[start] = ar[end];
			ar[end] = c;
			start ++;
			end --;	
			return reverseRecursive(ar, start, end);
		}
		return ar;
	}
}
