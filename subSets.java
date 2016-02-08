package testAndfun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSets {
	
	public static void main(String[] args){
		subSets ss = new subSets();
		int[] input = {1,2,3};
		System.out.println((ss.subsets(input)));
	}
	
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list= new ArrayList<List<Integer>>();
		if(nums==null || nums.length==0)
			return list;
		Arrays.sort(nums);
		//permutation of 0 - nums.len
        for(int i=0;i<=nums.length;i++){
        	//numbers of permutation needed, point to start permute, array, inner list, list
        	permutation(i,0,nums, new ArrayList<Integer>(), list);
        }
        return list;
    }
	
	private void permutation(int count, int start, int[] nums, List<Integer> tmp, List<List<Integer>> res){
		if (tmp.size() == count) {
	        res.add(tmp);
	        return;
	    }
		//have to start from particular point, otherwise will duplicate
	    for (int i = start; i < nums.length; i++) {
	        List<Integer> newTemp = new ArrayList<Integer>(tmp);
	        newTemp.add(nums[i]);
	        permutation(count, i + 1, nums, newTemp, res);
	    }
	}
}
