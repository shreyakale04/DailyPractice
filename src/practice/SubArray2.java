package practice;

public class SubArray2 {
	
	public static double findAverage(int[]nums, int k){
		
		int sum = 0;
		
		for(int i = 0; i< k ; i++){
			
			sum+=nums[i];
		}
		return (double) sum/k;
	}

	public static void main(String[] args) {
		int[]nums = {5};
		int k  = 1;
		
		System.out.printf("%.5f" , findAverage(nums , k));

	}

}
