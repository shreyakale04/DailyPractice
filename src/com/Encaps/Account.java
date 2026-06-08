package com.Encaps;

public class Account {
	
	private long acNo;
	private String Name;
	private String Email;
	private double amount;
	
	public long getAcNo(){
		return acNo;
	}
	public void setAcNo(long acNo){
		this.acNo = acNo;
	}
	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public String getEmail(){
		return Email;
	}
	public void setEmail(String Email){
		this.Email = Email;
	}
	public double getAmount(){
		return amount;
	}
	public void setAmount(double amount){
		this.amount = amount;
	}
	public static void main(String[] args) {
		
		Account ac = new Account();
		ac.setAcNo(4563421787L);
		ac.setName("Raj Deshmukh");
		ac.setEmail("rj22@example.com");
		ac.setAmount(50000);
		
		System.out.println(ac.getAcNo() + " " + ac.getName() + " " + ac.getEmail() + " " + ac.getAmount());
		
	}

}
