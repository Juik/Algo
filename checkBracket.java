//One is to check a string of parenthesis to see if all of them are paired correctly.

package testAndfun;

import java.util.Stack;

public class checkBracket {
	public static void main(String[] args){
		String[] ret = new String[8];
		
		checkBracket cb = new checkBracket();
		String input = "I know ( s - b { a[you]}heihei) is not health {}";
		System.out.println(cb.isCorrect(input));
		
	}
	
	public boolean isCorrect(String str){
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='[')
				stack.push(str.charAt(i));
			else if(str.charAt(i)==')'){
				if(stack.pop()!='(')
					return false;
			}
			else if(str.charAt(i)=='}'){
				if(stack.pop()!='{')
					return false;
			}
			else if(str.charAt(i)==']'){
				if(stack.pop()!='[')
					return false;
			}
		}
		return true;
	}
	
}

