package testAndfun;

import java.math.*;
import java.util.Arrays;

public class maxGap {
	public static void main(String[] args){
		maxGap mg = new maxGap();
		int[] input = {3,6,9,1};
		System.out.println(mg.maximumGap(input));
	}
	
	public int maximumGap(int[] num) {
		int max = 0;
		if(num.length<2)	return max;
		Arrays.sort(num);
		for(int i=0;i<num.length-1;i++){
			if(Math.abs(num[i]-num[i+1])>max)
				max = Math.abs(Math.abs(num[i]-num[i+1]));
		}
		return max;
    }
}
