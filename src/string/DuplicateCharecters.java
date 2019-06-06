package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class DuplicateCharecters {

	public static void main(String[] args) {
		printDuplicateCharecters("ddjaavaa");
	}

	public static void printDuplicateCharecters(String str){
		int length = str.length();
		Map<Character, Integer> countMap = new HashMap<>();
		for(int i = 0; i < length; i++) {
			if(countMap.containsKey(str.charAt(i))){
				countMap.put(str.charAt(i), countMap.get(str.charAt(i))+1);
			}else{
				countMap.put(str.charAt(i), 1);
			}
		}
		System.out.println("count for "+ countMap);
		for(Entry<Character, Integer> entry : countMap.entrySet()){
	        System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
	
}
