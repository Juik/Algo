package testAndfun;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	public static void main(String args[]){
		EvaluateReversePolishNotation erp = new EvaluateReversePolishNotation();
		String[] tokens = {"3", "-4",  "+"};
		System.out.println(erp.evalRPN(tokens));
	}
	public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int input;
        for(int i=0;i<tokens.length;i++){
        	if(tokens[i].charAt(0)>='0'&&tokens[i].charAt(0)<='9')
        		{input = Integer.parseInt(tokens[i]);
        		stack.push(input);
        		}
        	else if(tokens[i].length()>1&&tokens[i].charAt(0)=='-'){
        		input = Integer.parseInt(tokens[i]);
        		stack.push(input);
        	}
        	else if(tokens[i].charAt(0)=='+')
        		stack.push(stack.pop()+stack.pop());
        	else if(tokens[i].charAt(0)=='-'){
        		int tmp = stack.pop();
        		stack.push(stack.pop()-tmp);
        	}
        	else if(tokens[i].charAt(0)=='/'){
        		int tmp = stack.pop();
        		stack.push(stack.pop()/tmp);
        	}
        	else if(tokens[i].charAt(0)=='*')
        		stack.push(stack.pop()*stack.pop());
        }
        return stack.peek();
    }
}
