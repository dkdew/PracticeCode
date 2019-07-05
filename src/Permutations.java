import java.util.ArrayList;
import java.util.List;

public class Permutations {

	List<Integer> list = new ArrayList<Integer>();
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		int n = 123;
		String s = String.valueOf(n);
		permute(s,0, s.length()-1, list);
		System.out.println(list);

	}

	public static void permute(String s, int l, int r, List<Integer> list){
		if(l==r){
			System.out.println(s);
			list.add(Integer.valueOf(s));
			return;
		}

		for(int i = l; i<=r; i++){
			s = swap(s, l, i);
			permute(s, l+1, r,  list);
			s = swap(s, l, i);
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
