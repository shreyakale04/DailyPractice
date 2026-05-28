package com.recursion;

public class FactorialExample {

	static int factorial(int n){
	
		// Base case: If n is 0 or 1, factorial is 1    
		if(n == 0 || n == 1){
			
			return 1;
		}
 // Recursive case: If n is greater than 1, recursively call factorial function 
//		   with n-1 and multiply it with n    
		else {
			
			return n * factorial(n-1);
		}
	}
	
	
	public static void main(String[] args) {
	
  int num = 5;
  int result = FactorialExample.factorial(num);
  System.out.println("Factorial of " + num + " is: " + result);
	}

}
