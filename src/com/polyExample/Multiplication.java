package com.polyExample;

public class Multiplication {
//Method Overloading (Compile time polymorohism)
	
	static int Mul(int a, int b){
		
		System.out.println("Multiplication of two values: ");
		return a*b;
	}
	
	static int Mul(int a, int b, int c){
		
		System.out.println("Multiplication of three values: ");
		return a*b*c;
	}
	public static void main(String[] args) {
		
       System.out.println(Multiplication.Mul(10, 20));
       System.out.println(Multiplication.Mul(5, 4, 2));
	}

}
