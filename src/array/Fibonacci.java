package array;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		for(int i = 1; i<=number; i++){
			System.out.println(fiboRec(i)+"");
		}
	}
	
	public static int fiboIt(int n){
		if(n==1 || n == 2){
			return 1;
		}
		int fib1 = 1;
		int fib2 = 1;
		int fib = 1;
		for(int i = 3; i <= n; i++){
			fib = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib;
		}
		return fib;
	}
	
	public static int fiboRec(int n){
		if(n <=2 ){
			return 1;
		}
		return fiboRec(n-1)+fiboRec(n-2);
	}
	
	

}
