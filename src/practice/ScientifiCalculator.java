package practice;

import java.util.Scanner;

public class ScientifiCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Operation");
		System.out.println("1, Square");
		System.out.println("2, Cube");
		System.out.println("3, Square Root");
		System.out.println("4, power");
		System.out.println("5, Log(base 10)");
        System.out.println("6, Natural Log");
        System.out.println("7, Sin");
        System.out.println("8, Cos");
        System.out.println("9, Tan");
        
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        
        double num;
        double result;
        
        switch(choice){
    	
    	case 1:
    		System.out.println("Enter Number");
    		num = sc.nextDouble();
    		result = Math.pow(num, 2);
    		System.out.println("Square : " + result);
    		break;
    		
    	case 2:
    		System.out.println("Enter Number");
    		num = sc.nextDouble();
    		result = Math.pow(num, 3);
    		System.out.println("Cube : " + result);
    		break;
    		
    	case 3:
    		System.out.println("Enter Number");
    		num = sc.nextDouble();
    		result = Math.sqrt(num);
    		System.out.println("Square root : " + num);
    		break;
    		
    	case 4:
    		System.out.println("Enter base");
    		double base = sc.nextDouble();
    		
    		System.out.println("Enter exponent");
    		double exp = sc.nextDouble();
    		
    		result = Math.pow(base, exp);
    		System.out.println("Power : " + result);
    		break;
    		
    	case 5:
    		System.out.println("Enter Number");
    		num = sc.nextDouble();
    		
    		result = Math.log10(num);
    		System.out.println("log of base 10: " + result);
    		break;
    		
    	case 6:
    		System.out.println("Enter Number");
    		num = sc.nextDouble();
    		
    		result = Math.log(num);
    		System.out.println("Log : " + num);
    		break;
    		
    	case 7:
    		System.out.println("Enter angle in degree: ");
    		num = sc.nextDouble();
    		
    		result = Math.sin(Math.toRadians(num));
    		System.out.println("Sin: " + num);
    		break;
    		
    	case 8:
    		System.out.println("Enter angle in degree: ");
    		num = sc.nextDouble();
    		
    		result = Math.cos(Math.toRadians(num));
    		System.out.println("Cos: " + num);
    		break;
    		
    	case 9: 
    		System.out.println("Enter angle in degree: ");
    		num = sc.nextDouble();
    		
    		result = Math.tan(Math.toRadians(num));
    		System.out.println("Tan: " + num);
    		break;
    	}
  sc.close();
        
   }
	
}
