package array;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = { 1, 2, 3, 4, 5, 8, 7, 9, 10 };
		System.out.println("siz3e is :"+numbers.length);
		System.out.println("missing number is :" + getMissingNumber(numbers, 10));
	}

	public static int getMissingNumber(int numbers[], int length) {

		int sum = (length * (length + 1)) / 2;
		for (int i = 0; i < length - 1; i++) {
			sum = sum - numbers[i];
		}
		if (sum > 0)
			return sum;
		else {
			return -1;
		}
	}
}
