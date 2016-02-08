package testAndfun;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class removeDuplicatesII {
	public static void main(String[] args){
		removeDuplicatesII dp = new removeDuplicatesII();
		int[] input = {1,1,1,1,1,1,1,2,2,2,2,3};
		System.out.println(dp.removeDuplicates(input));
		prinf(input);
	}
	
	 public int removeDuplicates(int[] nums) {
         if (nums == null || nums.length == 0)
             return 0;
         int count = 0;
         int k = 2;
         int i = 0;
         for (int j = 1; j < nums.length; j++) {
             if (nums[j] == nums[i]) {
                 if (++count == k - 1) {
                     nums[++i] = nums[j];
                 } 
             } else { 
                 nums[++i] = nums[j];
                 count = 0; //reset count 
             }
             System.out.print("Round"+j);
             prinf(nums);
             System.out.println();
         }
         return i + 1;
     }
	/*
	 public int removeDuplicates(int[] nums) {
		 	int ii = 0;
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i=0;i<nums.length;i++){
	            if(map.containsKey(nums[i])==false){
	                map.put(nums[i],1);
	                ii++;
	            }
	            else if(map.get(nums[i])==1){
	                map.put(nums[i],2);
	                ii++;
	            }
	            else
	            	continue;
	        }
	        
	        int j = 0;
	        for(Integer k : map.keySet()){
	        	if(map.get(k)==2){
	        		nums[j++] = k;
	        		nums[j++] = k;
	        	}
	        	else{
	        		nums[j++] = k;
	        	}
	        }
	        
	        return ii;
	    }
	 */
	 
	 
	 public static void prinf(int[] inp){
		 for(int in : inp )
		 System.out.print(" "+in);
	 }
	
}
