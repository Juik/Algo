package testAndfun;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String args[]){
		ValidParentheses vp =new ValidParentheses();
		System.out.println(vp.isValid("()"));
		
	}
	
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        if(s==null||s.length()==0)	return false;
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='[')	stack.push(s.charAt(i));
        	else{
                 if(stack.size()==0)
                     return false;
                 char top = stack.pop();
                 if(s.charAt(i)==')')
                     if(top!='(')
                         return false;
                 else if(s.charAt(i)=='}')
                    if(top!='{')
                        return false;
                 else if(s.charAt(i)==']')
                     if(top!='[')
                         return false;
        		}
        //System.out.println(stack);
        
    }
        return stack.size()==0;
}
}
