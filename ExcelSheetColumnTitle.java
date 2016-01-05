package testAndfun;

import java.util.Stack;

public class ExcelSheetColumnTitle {
	public static void main(String[] args){
		ExcelSheetColumnTitle esc = new ExcelSheetColumnTitle();
		System.out.println(esc.convertToTitle(26));
	}
	public String convertToTitle(int n) {
        int tmp = 0;
        Stack<Character> stack = new Stack<Character>();
        while(n!=0){
        	tmp = n % 26;
        	if(tmp==0) {
        		stack.push('Z');
        		n = n / 26 -1;
        	}
        	else{
        	stack.push((char) (tmp+64));
        	n = n / 26;}
        }
        String s = new String();
        while(!stack.empty()){
        	s += stack.pop();
        }
        return s;
    }
}
