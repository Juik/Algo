package testAndfun;

import java.util.Stack;

public class shortestSeq {
	public static void main(String[] args){
		Stack<Integer> stack = new Stack<Integer>();
		shortestSeq s = new shortestSeq();
		System.out.println(s.solution(17));
	}
	
	public int solution(int N) {
        // write your code in Java SE 8
        int[] res = new int[N];
        int i=0;
        int count =0;
        while(true){
            int tmp = N % 2;
            if(N==1)
                break;
            if(tmp ==0){
                N/=2;
                count++;
            }
            else if(tmp==1){
                N = N-1;
                count++;
            }
            i+=1;
        }
        return count+1;
    }
}
