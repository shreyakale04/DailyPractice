package practice;

import java.util.Scanner;

public class CheckNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		if(num < 0){
			System.out.println("No is Negative");
		}
		else if(num > 0){
			System.out.println("No is Positive");
		}
		else{
			System.out.println("No is zero");
		}

		sc.close();
	}


}
