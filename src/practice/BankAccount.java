package practice;

public class BankAccount {
	
//private variables data hiding
	private double balance;
	
	BankAccount(double balance){
		this.balance = balance;
	}
	
	//Deposit method
	void deposit(double amount){
		if(amount > 0){
			balance+=amount;
			System.out.println("Deposited : " + amount);
		}else{
			System.out.println("Invalid deposite amount");
		}
		
	}
	//Withdraw method
	void withdraw(double amount){
		if(amount > 0 && amount <= balance){
			System.out.println("Withdraw : " + amount);
		}else{
			System.out.println("Insufficient balance of invalid amount");
		}
	}
	double getBalance(){
		return balance;
	}
	public static void main(String[] args) {
		
		BankAccount ac = new BankAccount(1000);
		
		ac.deposit(500);
		ac.withdraw(200);
		
		System.out.println("Current Balance: " + ac.getBalance());
		
		
	}
}

