package testAndfun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class houseRobber {
	public static void main(String[] args){
		houseRobber hr = new houseRobber();
		int[] input = {2,7,9,3,1};
		System.out.println(hr.robCircle(input));
	}
	//house robber II
	public int robCircle(int[] nums){
		if(nums==null || nums.length<1)
            return 0;
		int[] arr1;
		int[] arr2;
		arr1 = move(nums,0);
		arr2 = move(nums,nums.length-1);
		return Math.max(robMany(arr1), robMany(arr2));

	}
	
	private static int[] move(int[] nums, int index){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int num : nums){
			list.add(num);
		}
		list.remove(index);
		int[] ans = new int[nums.length];
		for(int i=0;i<list.size();i++)
			ans[i]=list.get(i);
		return ans;
	}
	
	
	
	//only if required to rob 2 houses
	 public int rob(int[] nums) {
	        if(nums==null || nums.length<1)
	            return 0;
	        if(nums.length<2)
	            return nums[0];
	        if(nums.length<3)
	            return Math.max(nums[0],nums[1]);
	        int[] big = new int[nums.length];
	        big[0] = nums[0];
	        for(int i=1;i<nums.length;i++){
	            if(nums[i]>big[i-1])
	                big[i] = nums[i];
	            else
	                big[i] = big[i-1];
	        }
	        
	        int max = big[1];
	        for(int i=2;i<nums.length;i++){
	            if(nums[i]+big[i-2] > max)
	                max = nums[i]+big[i-2];
	        }
	        return max;
	    }
	 //house robber I
	 public int robMany(int[] nums){
	        if(nums==null || nums.length<1)
	            return 0;
	        if(nums.length<2)
	            return nums[0];
	        if(nums.length<3)
	            return Math.max(nums[0],nums[1]);
	        int max = nums[0];
//	        if(nums[1]>max)
//	        	max = nums[1];
	        int[] big = new int[nums.length];
	        big[0] = nums[0];
	        big[1] = nums[1];
	        for(int i=2;i<nums.length;i++){
	        	big[i] = nums[i] + max;
	        	if(big[i-1] > max)
	        		max = big[i-1];
	        }
	        System.out.println(Arrays.toString(big));
	        return big[nums.length-1] > big[nums.length-2]?big[nums.length-1]:big[nums.length-2];
	 }
}
