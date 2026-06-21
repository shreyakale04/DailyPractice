package com.atmPrj;

import java.util.Scanner;

public class ATMprj {

	double balance = 40000;
	
	void checkBalance(){
		
		System.out.println("Balance : " + balance);
	}
	 void deposit(double amount){
		
		 balance += amount;
		 
		System.out.println("Deposited Successfully");
	}
	 void withdraw(double amount){
		 
		 if(balance >= amount){
			 
			 balance = balance - amount;
			 
			 System.out.println("Withdraw Successfully");
		 }
		 else{
			 
			 System.out.println("Insufficient balance");
		 }
		 
	 }
	 
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 ATMprj a = new ATMprj();
		 
		 int choice = sc.nextInt();
		 
		 do{
			 
			 System.out.println("\n1.Balance\n2.Deposit\n3.Withdraw\n4.Exit");
			 System.out.println("Choice: ");
			 choice = sc.nextInt();
			 
			 switch(choice){
			 
			 case 1:
				 a.checkBalance();;
				 break;
				 
			 case 2:
				 System.out.println("Amount: ");
				 a.deposit(sc.nextDouble());
				 break;
			 
			 case 3:
				 System.out.println("Amount: ");
				 a.withdraw(sc.nextDouble());
				 break;
				 
			 case 4:
				 System.out.println("Thank you");
				 break;
				 
				 default:
					 System.out.println("Invalid Choice");
				 
			 }
		 }
		 while(choice!=4);
		 
		 sc.close();
		 
		 
	}
	
	
}
