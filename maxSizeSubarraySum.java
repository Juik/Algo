package testAndfun;

import java.util.HashMap;
import java.util.Map;

public class maxSizeSubarraySum {
	public static void main(String[] args){
		maxSizeSubarraySum ms = new maxSizeSubarraySum();
		int[] input = {1,2,3,-3,-2,-1};
		System.out.println(ms.maxSubArrayLen(input, 1));
	}

	
	public int maxSubArrayLen(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        for (int i = 1; i < n; i++)
            nums[i] += nums[i - 1];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1); // add this fake entry to make sum from 0 to j consistent
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i] - k))
                max = Math.max(max, i - map.get(nums[i] - k));
            if (!map.containsKey(nums[i])) // keep only 1st duplicate as we want first index as left as possible
                map.put(nums[i], i);
        }
        return max;
    }
	
	
	
	/*
	//one solution takes O(n^2)
	public int maxSubArrayLen(int[] nums, int k) {
        if(nums==null || nums.length == 0)
        	return 0;
        int[] store = new int[nums.length+1];
        for(int i=0;i<store.length;i++){
        	if(i==0){
        		store[0] = 0;
        	}
        	else
        		store[i] = store[i-1] + nums[i-1];
        }
//        System.out.println(Arrays.toString(store));
        
        int max = 0;
        for(int i=0;i<store.length;i++){
        	for(int j=i;j<store.length;j++){
        		if((store[j] - store [i]) == k){
        			if(max < j-i)
        				max = j-i;
        		}
        	}
        }
        return max;
    }
    */

}
