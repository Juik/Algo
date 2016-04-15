package testAndfun;
/*
Write an efficient program to count number of 1s in binary representation of an integer.
*/
public class countBits {
	public static void main(String[] args){
		System.out.println(Integer.toBinaryString(-14));
		System.out.println(count(14));
		
	}
	
	public static int count(int x){
		int cnt=0;
		while(x!=0){
			cnt += x&1;
			x = x/2;
		}
		return cnt;
	}
	
}
