package practice;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name");
		String str1 = sc.next();
		
		System.out.println("Enter Second name");
		String str2 = sc.next();

		if(str1.length() !=  str2.length()){
			
			System.out.println("Not Anagram");
		}
		
		char[] a = str1.toLowerCase().toCharArray();
		char[] b = str2.toLowerCase().toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a,b)){
			
			System.out.println("Anagram");
		}
		else{
			System.out.println("Not Anagram");
		}
		sc.close();
	}

}
