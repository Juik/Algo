package testAndfun;

import java.util.HashSet;

public class happyNumber {
	HashSet<Integer> map = new HashSet<Integer>();
	
	public static void main(String[] args){
		happyNumber hn = new happyNumber();
		System.out.println(hn.isHappy(18));
	} 
	
	public boolean isHappy(int n) {
		
		if(map.contains(n))
			return false;
		if(n==1)
			return true;
		map.add(n);
		int res = 0;
		while(n!=0){
			res += Math.pow((n % 10), 2);
			n = n / 10;
		}
		return isHappy(res);
	}
}
