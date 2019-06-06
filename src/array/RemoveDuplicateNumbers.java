package array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {1,1,2,3,4,5,5};
		removeDuplicateNumbers(nums);
	}
	
	public static void removeDuplicateNumbers(int nums[]){
		Set<Integer> set = new HashSet<>(nums.length);
		for(int i = 0 ; i< nums.length; i++){
			Integer cur = nums[i];
			if(set.contains(cur)){
			nums[i] = 0;
			}
			set.add(cur);
		}
		
		for(int i : nums){
			System.out.println(i);
		}
	}

}
