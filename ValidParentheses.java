package testAndfun;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String args[]){
		ValidParentheses vp =new ValidParentheses();
		System.out.println(vp.valid("{idk that[1+(2+3)]*3}yo"));
		
	}
	
	//if it's not return -1, otherwise return how many parentheses
	public int valid(String s){
		if(s==null||s.length()==0)	return 0;
		Stack<Character> stack = new Stack<Character>();
		int cnt = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
				stack.push(s.charAt(i));
			else if(s.charAt(i)==')'){
				if(stack.pop()!='(')
					return -1;
				else cnt++;
			}
			else if(s.charAt(i)=='}'){
				if(stack.pop()!='{')
					return -1;
				else
					cnt++;
			}
			else if(s.charAt(i)==']'){
				if(stack.pop()!='[')
					return -1;
				else
					cnt++;
			}
			else
				continue;
		}
		return cnt;
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
