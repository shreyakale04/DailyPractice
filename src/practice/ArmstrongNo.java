package practice;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number");
			int num = sc.nextInt();
			
			int original = num;
			int sum = 0;
			
			while(num>0){
				int rem = num%10;
				sum = sum + rem*rem*rem;
				num = num/10;
				
			}
			System.out.println(sum == original ? "Armstrong No" : "Not Armstrong No" );
			
			sc.close();
	}

}
