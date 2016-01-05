package testAndfun;

public class FactorialTrailingZeroes {
	public static void main(String[] args){
	FactorialTrailingZeroes fc = new FactorialTrailingZeroes();
	System.out.println(fc.trailingZeroes(12));
	//System.out.println(howManyFive(25));
	}
	
	public int trailingZeroes(int n) {
        if(n <= 0)  
           return 0;  
       int num = 0;  
       int size;  
       while(n!=0){  
           size = n/5;  
           num += size;  
           n = size;  
       }  
       return num;  
   }
	/*
	public int trailingZeroes(int n) {
        int cnt = 0;
        if(n<5)	return 0;
		for(int i=4;i<=n;i++){
			System.out.print("No:"+i);
			cnt += howManyFive(i);
		}
		return cnt;
    }
	
	public static int howManyFive(int n){
		int count=0;
		while(n%5==0 && n!=0){
			count++;
			n = n / 5;
		}
		System.out.println(" is "+count);
		return count;
	}
	*/
}
