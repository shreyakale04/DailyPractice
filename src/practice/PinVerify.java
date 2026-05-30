package practice;

public class PinVerify {

	private double balance;
	private int pin;
	
	PinVerify(double balance, int pin){
		this.balance = balance;
		this.pin = pin;
  }
	private boolean VerifyPin(int inputPin){
		return this.pin == inputPin;
	}
	
	//Deposit method
		void deposit(double amount, int inputPin){
			if(VerifyPin(inputPin)){
				if(balance > 0){
					balance+=amount;
					System.out.println("Deposite : " + amount);
				}
				else{
					System.out.println("Invalid Amount");
				}
				
			}
			else{
				System.out.println("Incorrect Pin");
			}
			
		}
	         
		//Withdraw method
		
		void withdraw(double amount, int inputPin){
			
	     if(VerifyPin(inputPin)){
	    	 if(amount<=balance && amount>0){
	    		 System.out.println("Withdraw : " + amount);
	    	 }
	    	 else{
	    		 System.out.println("Insufficient balance of invalide amount");
	    	 }
	     }
	     else{
	    	 System.out.println("Incorrect Pin");
	     }
	     }
		void getBalance(int inputPin){
			if(VerifyPin(inputPin)){
         System.out.println("Balance : " + balance);
			}else{
				System.out.println("Incorrect Pin");
		}
		}
		public static void main(String[] args) {
			
			PinVerify pp = new PinVerify(40000 , 1108);
			pp.deposit(5000, 1108);
			pp.withdraw(20000, 1212);
			pp.getBalance(1108);
		}
     }
