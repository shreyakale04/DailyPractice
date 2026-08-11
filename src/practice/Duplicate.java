package practice;

import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {

		int[]arr = {1, 2, 2, 3, 7, 8, 4, 4, 9};
//		int n = 9;
		
		HashSet<Integer>set = new HashSet<>();
		
		for(int num: arr){
			
			if(!set.add(num)){
				
				System.out.println("Duplicate: " + num);
				
			}
			
		}

	}

}
