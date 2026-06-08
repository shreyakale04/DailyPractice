package com.FileExample;
import java.util.Scanner;
import java.io.FileOutputStream;

public class CreateFileExample2 {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the file Name");
			String name = sc.nextLine();
			
		
			FileOutputStream fos = new FileOutputStream(name, true); //true for append mode
			
			System.out.println("Enter file content: ");
			String str = sc.nextLine()+"\n"; //str stores the string which we have entered  
			byte[]b = str.getBytes(); 
			fos.write(b);
			fos.close();
			System.out.println("File Saved");
			sc.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
