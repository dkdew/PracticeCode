/*package whatever //do not write package name here */

package array;

import java.io.*;
import java.util.Arrays;

class TwoSumSolution {
	public static void main (String[] args) {
		System.out.println("GfG!");
		twoSum(9);
	}
	
	  public static  int[] twoSum( int target) {
	     int[] nums = {2,7,11,15};
	     System.out.println(nums);
        int start = 0;
        int end = (nums.length)-1;
        int [] result = new int[2];
        System.out.println(start);
        System.out.println(end);
        while(start<end){
        	 // System.out.println(start);
             // System.out.println(end);
            if(nums[start]+nums[end]==target){
                result[0]=start;
                result[1]=end;
            }else if(nums[start]+nums[end]>target){
                end--;
            }else if(nums[start]+nums[end]<target){
                start++;
            }
        }
        System.out.println(result[0]);
        System.out.println(result[0]);
        return result;
    }
}