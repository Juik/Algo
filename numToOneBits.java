package testAndfun;

public class numToOneBits {
	public static void main(String args[]){
		numToOneBits nt = new numToOneBits();
		System.out.println(nt.hammingWeight(2147483647));
	}
	public int hammingWeight(int n){
		int res = 0;
		while(n>0){
			n = n & (n-1);
			res++;
			System.out.println("res:"+res+" n="+n);
		}
		return res;
	}
}
