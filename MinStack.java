package testAndfun;

import java.util.ArrayList;
import java.util.Stack;

class MinStack {
	Stack<Integer> stack = new Stack<Integer>();
	int min;
	
	public static void main(String args[]){
		MinStack ms  = new MinStack();
		ms.push(0);
		ms.push(1);
		ms.push(0);
		System.out.println(ms.getMin());
		ms.pop();
		//System.out.println(ms.pop(););
		System.out.println(ms.getMin());
	}

    public void push(int x) {
    	if(stack.empty()||x<=min){
    		stack.push(min);
    		stack.push(x);
    		min = x;
    	}
    	else stack.push(x);
    }

    public void pop() {
    	int tmp = stack.pop();
    	if(tmp==min)	min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}



