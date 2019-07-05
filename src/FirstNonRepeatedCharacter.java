
import java.util.*;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("character is :" + findFirstNonRepeatedCharacter("dimdine"));
	}

	public static char findFirstNonRepeatedCharacter(String str) {
		if (str == null || str.length() == 0) {
			throw new RuntimeException();
		}
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) == 1) {
				return str.charAt(i);
			}
		}
		throw new RuntimeException();
	}

}
