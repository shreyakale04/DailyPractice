package practice;

public class Main {

	public static void main(String[] args) {
		
		new Student();
	}
}
class Student{
	public Student(){
		System.out.println("Constructor");
	}
	static{
		
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block");
	}
}
