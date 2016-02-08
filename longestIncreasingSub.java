package testAndfun;

import java.util.Arrays;

public class longestIncreasingSub {
	public static void main(String[] args){
		longestIncreasingSub lis = new longestIncreasingSub();
		int[] input = {10, 9, 2, 5, 3, 4, 7, 101, 18};
		System.out.println(lis.lengthOfLIS(input));
	}
	
	public int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length]; //里面存的是几步能走到这儿
        Arrays.fill(res, 1);
        for(int i=0;i<nums.length;i++){
        	for(int j=0;j<i;j++){
        		if(nums[i] > nums[j]) //如果i比之前的所有j都大，说明increasing了，那么就比较res[j]+1（因为还要加自己）和自己的值（初始1）比谁大
        			res[i] = Math.max(res[i],res[j]+1);
        	}
        }
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            max = Math.max(max, res[i]);
        }
        return max;
        
    }
}
