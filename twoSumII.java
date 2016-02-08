package testAndfun;

import java.util.Arrays;
import java.util.HashMap;

public class twoSumII {
	public static void main(String[] args){
		twoSumII ts = new twoSumII();
		int[] input= {2,3,4};
		System.out.println(Arrays.toString(ts.twoSum(input, 6)));
	}
	
	public int[] twoSum(int[] numbers, int target) {
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	       int[] ind = {-1,-1};
	       //put array into the map
	       for(int i=0;i<numbers.length;i++){
	           map.put(numbers[i],i);
	       }
	       //look for matching half by ensuring the index is appropriate
	       for(int i=0;i<numbers.length;i++){
	           if(map.get(target - numbers[i])==null)
	            continue;
	           if(map.get(target - numbers[i]) > i){
	                ind[0] = i+1;
	                ind[1] = map.get(target - numbers[i])+1;
	                return ind;
	           }
	       }
	       return ind;
	    }
}
