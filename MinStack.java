package testAndfun;

import java.util.ArrayList;
import java.util.Stack;

class MinStack {
	Stack<Integer> stack = new Stack<Integer>();
	int min=Integer.MAX_VALUE;
	
	public static void main(String args[]){
		MinStack ms  = new MinStack();
		ms.push(-2);
		ms.push(1);
		ms.push(2);
		ms.push(1);
		System.out.println(ms.getMin());
		ms.pop();
		//System.out.println(ms.pop(););
		System.out.println(ms.getMin());
	}

    public void push(int x) {
    	if(stack.empty()||x<=min){
    		stack.push(min);//这个东西相当于在记录push之前最小值
    		stack.push(x);
    		min = x;//这个东西相当于在记录push之后最小值
    	}
    	else stack.push(x);
    }

    public void pop() {
    	int tmp = stack.pop();
    	if(tmp==min)	
    		min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}



