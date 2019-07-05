

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumberFromTheList {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,4,5,5};
		findDuplicateNumber(nums);
		
	}
	
	public static int findDuplicateNumber(int nums[]){
		Set<Integer> set = new HashSet<Integer>(nums.length);
		for(Integer i : nums){
			if(set.contains(i)){
				System.out.println(i);
			}
			set.add(i);
		}
		return -1;
	}

}
