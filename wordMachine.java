package testAndfun;

import java.util.Stack;

public class wordMachine {
	public static void main(String[] args){
		wordMachine wm = new wordMachine();
		System.out.println(wm.solution("5 6 + -"));
	}
	
	
	 public int solution(String S) {
	        // write your code in Java SE 8
	        Stack<Integer> stack = new Stack<Integer>();
	        String[] str = S.split(" ");
	        for(String s : str){
	        
	            if(Character.isDigit(s.charAt(0))){
	                stack.push(Integer.parseInt(s));
	            }
	            else if(s.equals("POP")){
	            	try{
	                stack.pop();
	            	}
	            	catch(Exception e){
	            		return -1;
	            	}
	            }
	            else if(s.equals("DUP")){
	            	try{
	                int tmp = (int) stack.pop();
	                stack.push(tmp);
	                stack.push(tmp);
	            	}
	            	catch(Exception e){
	            		return -1;
	            	}
	            }
	            else if(s.equals("+")){
	            	try{
	                int fir = stack.pop();
	                int sec = stack.pop();
	                stack.push(fir+sec);
	            	}
	            	catch(Exception e){
	            		return -1;
	            	}
	            }
	            else if(s.equals("-")){
	            	try{
		                int fir = stack.pop();
		                int sec = stack.pop();
		                stack.push(fir-sec);
		            	}
		            	catch(Exception e){
		            		return -1;
		            	}
	            }
	            else
	                continue;
	        	}
	        return stack.pop();
	 }
}
