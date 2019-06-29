package array;

public class Permutations {

	public static void main(String args[]) {
		permute("dinesh",6, 0);
	}

	public static void permute(String s, int n, int i){
		if(i==n){
			System.out.println(s);
			return;
		}

		for(int j = i; j<n; j++){
			s = swap(s, i, j);
			permute(s, n, j+1);
			s = swap(s, i, j);
		}
	}

	public static String swap(String s, int i, int j){
		char[] chars = s.toCharArray();
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
		s = String.valueOf(chars);
		return s;
	}
}
