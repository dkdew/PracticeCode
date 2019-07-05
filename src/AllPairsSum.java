

import java.util.HashMap;
import java.util.Map;

public class AllPairsSum {

	public static void main(String[] args) {
		int num[] = {1,1,2,3,2};
		allPairSum(num,4);

	}

	public static void allPairSum(int nums[], int k){
		if(nums == null || nums.length<2){
			return;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int currentNum : nums){
			int target = k - currentNum;
			if(map.get(target) == null){
				map.put(target, target);
			}else{
				System.out.println(target +" "+currentNum);
			}
			
		}
	}
}
