package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowels {

	public static void main(String[] args) {
		String str = "Java Programming";
		int countv = 0;
		int countc = 0;
		
		Set<Character> set = new HashSet<>(
		Arrays.asList('a', 'e', 'i', 'o', 'u')
		);
		
		str = str.toLowerCase();
		
		for(char ch : str.toCharArray()){
			
			if(ch >= 'a' && ch <= 'z')
			{	
				if(set.contains(ch)){
				countv++;
		}
				else{
					countc++;
				}
			}
		

	}
		System.out.println("Vowels = " + countv);
		System.out.println("Consonants = " + countc);
	}
	

	}


