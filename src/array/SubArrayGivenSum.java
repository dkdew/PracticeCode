package array;

import java.io.*;

class SubArrayGivenSum {
	public static void main (String[] args) {
		System.out.println("GfG!");
		int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		subArray(data, 15);
	}

	public static void subArray(int data[], int num){
	    int start = 0;
	    int sum = 0;
	    for(int i =0; i<data.length; i++){
	        sum = sum +data[i];
	        while(sum > num && start < i){
	            sum = sum - data[start];
	            start ++;
	        }
	        if(sum == num){
	            System.out.println(start + " "+ i);
	        }
	    }

	}
}