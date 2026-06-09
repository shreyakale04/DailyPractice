package practice;

import java.util.Arrays;

public class RotateArray {

	static void reverse(int[]arr, int start, int end){
		
		while(start<end){
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
	
		int[]arr = {10, 20, 30, 40, 50, 60};
		int d = 3;
		int n = arr.length;
		
		reverse(arr, 0, d-1);
		reverse(arr, d, n-1);
		reverse(arr, 0, n-1);
		
		System.out.println(Arrays.toString(arr));
	}

}
