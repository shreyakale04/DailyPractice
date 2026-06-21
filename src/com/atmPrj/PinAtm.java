package com.atmPrj;

import java.util.Scanner;

public class PinAtm {

public static void main(String[] args) {
  
	Scanner sc = new Scanner(System.in);
	int pin = 2345;
	int attempts = 0;
	double balance = 50000;
	
	String statement = "";
	
	while(attempts < 3){
		
		System.out.println("Enter Pin");
		int enteredPin = sc.nextInt();
		
		if(enteredPin == pin){
			
			System.out.println("Login Successfull");
			
			int choice;
			
			do{
				 System.out.println("\n1.CheckBalance\n2.Deposit\n3.Withdraw\n4.ChangePin\n5.MiniStatement\n6.Exit");
				 System.out.println("Choice: ");
				 choice = sc.nextInt();
				 
				 switch(choice){
				 
				 case 1:
				    
				 System.out.println("Current Balance: " + balance);
				 
				 case 2:
					 
					 System.out.println("Enter Deposite Amount: ");
					 
					 double deposit = sc.nextDouble();
					 
					 balance += deposit;
					 
					 statement += "Deposite " + deposit + "\n";
					 
					 System.out.println("Deposit Successful");
					 
					 break;
					 
				 case 3:
					 
                      System.out.println("Enter Withdraw Amount: ");
					 
					   double withdraw = sc.nextDouble();
					   
					   if(withdraw <= balance){
						   
						   balance -= withdraw;
						   
						   statement += "Withdraw " + withdraw + "\n";
						   
						   System.out.println("Withdraw Successful");
						   
					   }
					   else{
						   System.out.println("Insufficient Balance");
					   }
					   break;
					   
				 case 4:
					 
					 System.out.println("Enter New Pin: ");
					 
					 pin = sc.nextInt();
					 
					 System.out.println("Pin changed Successfully");
					 
					 break;
					 
				 case 5:
					 System.out.println("\n========Mini Statement");
					 
					 if(statement.isEmpty()){
						 
						 System.out.println("No Transictions");
					 }
					 else{
						 System.out.println(statement);
					 }
					 break;
					 
				 case 6: 
					 System.out.println("Thank you for using ATM");
					 break;
					 
					 default:
						 
						 System.out.println("Invalid Choice");
					 
					 
				 }
			}while(choice != 6);
			
			break;
		}
		else{
			attempts++;
			System.out.println("Wrong PIN");
			
			if(attempts == 3){
				System.out.println("Card Blocked! 3 wrong answer");
			}
		}
	}
	   sc.close();
	
      
	}

}
