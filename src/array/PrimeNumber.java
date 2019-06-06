package array;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrimeRoot(35)+"");
	}

	public static boolean isPrimeRoot(int n) {
		int root = (int) Math.sqrt(n);
		for (int i = 2; i <= root; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}


}