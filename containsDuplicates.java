package testAndfun;

import java.util.HashMap;

public class containsDuplicates {
	
	     public static void main(String[] args){
	    	 containsDuplicates cd = new containsDuplicates();
	    	 int[] num = {3,433,54,12,8,4,31};
	    	 System.out.println(cd.containsDuplicate(num));
	     }   
		 
		 
	     public boolean containsDuplicate(int[] nums) {
	    	 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    	 for(int i=0;i<nums.length;i++){
	    		 if(map.get(nums[i])!=null){
	    			 return true;
	    		 }
	    		 map.put(nums[i], 1);
	    	 }
	    	 return false;
	     }
}
