package array;

import java.io.*;

class Kadens {
	public static void main (String[] args) {
		System.out.println("GfG!");
		int data[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		subArray(data);
	}

	public static void subArray(int data[]){
	    int maxEndingHere = 0;
	    int maxSoFare = 0;
	    for(int i =0; i<data.length; i++){
	        maxEndingHere = maxEndingHere + data[i];
	        if(maxEndingHere > maxSoFare){
	            maxSoFare = maxEndingHere;
	        }
	      if(maxEndingHere < 0){
	          maxEndingHere = 0;
	      }
	    }
	    System.out.println(maxSoFare);

	}
}