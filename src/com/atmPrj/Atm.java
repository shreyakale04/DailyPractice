package com.atmPrj;
import java.util.Scanner;

public class Atm {

	double balance = 10000;
	
	void checkBalance(){
		
		System.out.println("Current balance : " + balance);
	}
	
	void deposite(double amount){
		
		balance = balance + amount;
		
		System.out.println(amount + "deposited successfully");
	}
	
	void withdraw(double amount){
		
		if(amount > balance){
			
			System.out.println("Insufficient Balance");
		}
		else{
		
			balance = balance - amount;
			System.out.println(amount + "withdrawn successfully");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Atm a = new Atm();
		
		int choice;
		
		do{
			System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            
            System.out.println("Enter your choice: ");
            
            choice = sc.nextInt();
            
            switch(choice){
            
            case 1: 
            	
            	a.checkBalance();
            	break;
            	
            
            case 2:
            	
            	System.out.println("Enter amount to deposit: ");
            	
            	double depositAmount = sc.nextDouble();
            	
            	a.deposite(depositAmount);
            	
            	break;
            	
            case 3:
            	System.out.println("Enter amount to withdraw: ");
            	
            	double withdrawAmount = sc.nextDouble();
            	
            	a.withdraw(withdrawAmount);
            	
            	break;
            	
            case 4: 
            	
            	System.out.println("Thank you");
            	break;
            	
            default:
            	
            	System.out.println("Invalid Choice");
            	
            }
		}
		while(choice != 4);
		sc.close();
	}
}

