package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String str = sc.next();
		str = str.toLowerCase();
		int n = str.length();
		String rev = "";
		
		for(int i = n-1; i>=0; i--){
			
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)){
			
			System.out.println("Palindrome");
		}
		else{
	    	  System.out.println("Not palindrome");
		
	}
		sc.close();
	}

}
