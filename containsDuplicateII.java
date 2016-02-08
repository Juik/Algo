package testAndfun;

import java.util.HashMap;

public class containsDuplicateII {
	public static void main(String[] args){
		containsDuplicateII cd = new containsDuplicateII();
		int[] input = {1,0,1,1};
		System.out.println(cd.containsNearbyDuplicate(input, 1));
	}
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if(nums.length==0||nums==null)
            return false;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null)
                map.put(nums[i],i);
            else
                if((i - map.get(nums[i]))<=k)
                    return true;
                else
                	map.put(nums[i], i);
        }
        return false;
	}
}
