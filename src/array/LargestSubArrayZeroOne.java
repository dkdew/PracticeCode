package array;

public class LargestSubArrayZeroOne {

	public static void main(String[] args) {
		int arr[] = {1,0,1,1,0,1,0,0};
		System.out.println(maxLen(arr));
	}
	
    static int maxLen(int[] arr) 
    {
         int maxEndingHere = 0;
         int maxSoFare = 0;
         
         for(int i = 0; i<arr.length -1; i++){
             if(arr[i] != arr[i+1]){
                 maxEndingHere = maxEndingHere + 1;
             }else{
                 maxEndingHere = 0;
             }
             if(maxEndingHere > maxSoFare){
                 maxSoFare = maxEndingHere; 
             }
         }
         return maxSoFare;
    }

}
