package testAndfun;

//great common divisor
public class gcd {
	public static void main(String[] args){
		gcd g = new gcd();
		int[] input = {16,64,26,78};
		System.out.println(g.getGCD(input));
		
	}
	
	public int getGCD(int[] arr){
		if(arr==null||arr.length==0)
			return 0;
		if(arr.length==1)
			return arr[0];
		
		int res = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>0 && res > 0)
				res = helper(res,arr[i]);
			else
				return 0;
		}
		return res;
	}
	
	//找到之前的最大公约数和数组下一个数的最大公约数
	static int helper(int m, int n){
		if(m % n == 0)
			return n;
		else{
			//如果不能整除，就用m%n往下接着求
			return helper(n, m%n);
		}
	}
}
