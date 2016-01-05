package testAndfun;

import java.util.Arrays;

public class LongestConsecutiveSequence {
	public static void main(String[] args){
		LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
		int[] input = {1,0,-1,1};
		System.out.println(lcs.longestConsecutive(input));
	}
	public int longestConsecutive(int[] num) {
		if(num.length<=1)	return num.length;
        int count =1 ;
        int tmp=1;
        Arrays.sort(num);
        
        //System.out.println(Arrays.toString(num));
        int i=0;
        while(i<num.length-1){
        	if(num[i]==num[i+1]-1)	tmp++;
        	if(num[i]==num[i+1]){
        		if(tmp>count){
        			count = tmp;
        		}
        		i++;
        		continue;
        	}
        	if(num[i]!=num[i+1]-1 || i==num.length-2){
        		if(tmp>count)	{
        			count = tmp;
        		}
        		tmp =1;
        	}
        	i++;
        }
        return count;
    }
	
	}
