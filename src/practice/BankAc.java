package practice;

public class BankAc {
	
	String AcHolder;
	double balance = 30000;
	
	void deposite(double amount){
		
		if(amount > 0){
			
			balance += amount;
			
			System.out.println("Amount deposited: " + amount);
			System.out.println("Balance: " + balance);
		}
		else{
			System.out.println("Enter Amount is invalid");
		}
	}
	
	void withdraw(double amount){
		
		if(amount <= balance){
			
			balance -= amount;
			
			System.out.println("Amount Withdraw : " + amount);
			System.out.println("Balance: " + balance);
		}
		else{
			System.out.println("Insufficient Balance");
		}
	}
	
	

	public static void main(String[] args) {
		
		BankAc a = new BankAc();
		
          a.AcHolder = "Shrutika";
          a.deposite(3000);
          a.withdraw(4000);

	}

}
