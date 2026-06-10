package com.StackEX;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		
     String str = "({[]})";
     
     Stack <Character> stk = new Stack<>();
     boolean balanced = true;
     
     for(char ch : str.toCharArray()){
    	 
    	 if(ch == '(' || ch == '{' || ch == '['){
    		 stk.push(ch);
    	 }
    	 else if(ch == ')' || ch == '}' || ch == ']'){
    		 
    		 if(stk.isEmpty()){
    			 balanced = false; 
    			 break;
    		 }
    		 char top = stk.pop();
    		 
    		 if((ch == ')' && top != '(')|| 
    		   (ch == '}' && top != '{') ||
    		   (ch == ']' && top != '[')){
    			   
    			 balanced = false;
    			 break;
    		   }
    	 }
     }
     if(!stk.isEmpty()) {
         balanced = false;
     }

     System.out.println(balanced ? "Balanced" : "Not Balanced");
     
	}

}
