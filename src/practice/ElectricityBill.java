package practice;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Unit");
		int unit = sc.nextInt();
		int total;
		
		if(unit <= 100){
			
		total = unit * 5;
		 
		 System.out.println("Electricity bill : " + total);
		}
		else if(unit <= 200 && unit >= 101) {
			
			total = unit * 7;
			 
			 System.out.println("Electricity bill : " + total);
			}
		
		else {
			total = unit * 10;
			System.out.println("Electricity bill : " + total);
		}
		sc.close();
		}
		
	

	}


