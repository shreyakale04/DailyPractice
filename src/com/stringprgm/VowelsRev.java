package com.stringprgm;

public class VowelsRev {

	public static void main(String[] args) {
		
		String str = "Programming Language";
		String vowels = "aeiou";
		
		str = str.toLowerCase();
		StringBuilder s = new StringBuilder();
		
		for(int i = str.length()-1; i>=0; i--){
			
			char ch = str.charAt(i);
			
			if(vowels.indexOf(ch)!= -1){
				s.append(ch);
			}
		}
		System.out.println(s);

	}

}
