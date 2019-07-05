

public class LargestSmallestFromList {

	public static void main(String[] args) {
		int nums[] = {-20, 34, 21, -87, 92, 2147483647};
		findLargestAndSmallestNumber(nums);
	}
	
	public static void findLargestAndSmallestNumber(int nums[]){
	
		int smallest = nums[0];
		int largest = nums[0];
		for(int i = 0 ; i<nums.length; i++){
			int cur = nums[i];
			if(cur > largest){
				largest = cur;
			}
			 if(cur < smallest){
				smallest = cur;
			}
		}
		
		System.out.println(""+smallest+" "+ largest);
	}

}
