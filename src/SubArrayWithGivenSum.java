
public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int data[] = {7, 8, 9, 1, 2, 3, 4, 5, 6,  10 };
		findSubArrayWithGivenSum(data, 6);
		subArraySum(data,10,6);
	}

	public static void findSubArrayWithGivenSum(int data[], int num) {
		if (data == null) {
			return;
		}
		int length = data.length;
		for (int i = 0; i < length; i++) {
			int sum = 0;
			for (int j = i; j < length; j++) {
				sum = sum + data[j];
				if (sum == num) {
					System.out.println(i + " " + j);
					return;
				}
			}
		}
	}

	
	public  static void subArraySum(int arr[], int n, int sum) 
	{ 	    
	    int curr_sum = arr[0], start = 0, i; 
	    for (i = 1; i <= n; i++) 
	    { 
	        while (curr_sum > sum && start < i-1) 
	        { 
	            curr_sum = curr_sum - arr[start]; 
	            start++; 
	        } 
	        if (curr_sum == sum) 
	        { 
	            System.out.println (start+" "+ (i-1)); 
	            return ; 
	        } 
	        if (i < n) 
	          curr_sum = curr_sum + arr[i]; 
	    } 
	    System.out.println("No subarray found"); 
	   
	} 

}
