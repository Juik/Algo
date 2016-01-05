package testAndfun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
	public static void main(String args[]){
		int[] s={1,-1,-1,0};
		threeSum ss = new threeSum();
		System.out.println(ss.sum(s));
	}
	
	
	List<List<Integer>>	list = new ArrayList<List<Integer>>();
	
	public List<List<Integer>>	sum(int[] num){
		if(num==null || num.length<3)	return list;
		
		Arrays.sort(num);
		int len = num.length; 
		for(int i=0;i<len-2;i++){
		if(i>0 && num[i]==num[i-1] )	continue;
		match(num,num[i],i+1,len-1);
		}
		return list;
	}
	
	public void match(int[] num, int input, int l, int r){
		while(l<r){
			System.out.println(input+"\t"+num[l]+"\t"+num[r]);
			if(input+num[l]+num[r]==0){
				List<Integer>	in = new ArrayList<Integer>();
				in.add(input);  //System.out.println(input);
				in.add(num[l]);	//System.out.println(l);
				in.add(num[r]);	//System.out.println(r);
				list.add(in);
				while(l<r&&num[l]==num[l+1])	l++;
				while(l<r&&num[r]==num[r-1])	r--;
				l++;
				r--;
			}	
			else if(input+num[l]+num[r]<0)	l++;
			else r--;
		}			
	}
}
