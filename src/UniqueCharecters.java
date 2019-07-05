
public class UniqueCharecters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUniqueCharecters("abcsdfgc"));
	}

	public static boolean isUniqueCharecters(String s) {
		int length = s.length();

		boolean[] countArray = new boolean[128];

		for (int i = 0; i < length; i++) {
			Character c = s.charAt(i);
			if (countArray[c] == true) {
				return false;
			}
			countArray[c] = true;
		}
		return true;
	}
}