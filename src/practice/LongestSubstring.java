package practice;

import java.util.HashSet;

public class LongestSubstring {

	public static void main(String[] args) {
		String str = "abcabcbb";
		
		HashSet<Character>set = new HashSet<>();
		
		int left = 0;
//		int start = 0;
		int maxLen = 0;
		
		for(int right = 0; right < str.length(); right++){
			
			while(set.contains(str.charAt(right))){
				set.remove(str.charAt(left));
				left++;
				
			}
			
			set.add(str.charAt(right));
			
			maxLen = Math.max(maxLen, right - left + 1);
			
//			if(right - left + 1 > maxLen){
//				
//				maxLen = right - left + 1;
//                start = left;
//			}
		}

		
		System.out.println("Longest Substring Length : " + maxLen);
//		 System.out.println("Length = " + maxLen);
//	        System.out.println("Substring = " +
//	                str.substring(start, start + maxLen));
	}

}
