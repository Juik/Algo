package testAndfun;

import java.util.Arrays;

public class dayChange {
	public static void main(String[] args){
		dayChange dc = new dayChange();
		int[] input = {1,0,0,0,0,1,0,0};
		System.out.println(Arrays.toString(dc.change(input,1)));
	}
	
	public int[] change(int[] arr,int days){
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			if(i==0||i==arr.length-1)
				res[i] = 0;
			else{
				if(arr[i-days]==arr[i+days])
					res[i] = 0;
				else
					res[i] = 1;
			}
		}
		return res;
	}
}
