package testAndfun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class fourSum {
	public static void main(String[] args){
	fourSum fs = new fourSum();
	int[] input = {-5,-3,-8,9,6,-10,9,8,-5,4,8,-4,3,7,4,-7,5,0};
	prinf(fs.fourSum(input, -6));
	}
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		HashSet set = new HashSet();
		
		//create the sum pair 
		HashMap<int[], List<Integer>> map = new HashMap<int[],List<Integer>>();
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				List<Integer> pair = new ArrayList<Integer>();
//				int sum = nums[i] + nums[j];
				pair.add(i);
				pair.add(j);
				int[] arr = new int[2];
				arr[0] = nums[i];
				arr[1] = nums[j];
				map.put(arr, pair);
			}
		}
		
		Iterator entries = map.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry entry = (Map.Entry) entries.next();
		    int[] key = (int[])entry.getKey();
		    List<Integer> value = (List<Integer>)entry.getValue();
		    //another for-loop iteration
		    Iterator entries2 = map.entrySet().iterator();
			while (entries2.hasNext()) {
			    Map.Entry entry2 = (Map.Entry) entries2.next();
			    int[] key2 = (int[])entry2.getKey();
			    List<Integer> value2 = (List<Integer>)entry2.getValue();
			    
			    int pos1 = map.get(key).get(0);
			    int pos2 = map.get(key).get(1);
			    int pos3 = map.get(key2).get(0);
			    int pos4 = map.get(key2).get(1);
			    if(not_same(pos1,pos2,pos3,pos4)){
			    	if(nums[pos1]+nums[pos2]+nums[pos3]+nums[pos4]==target){
			    		List<Integer> list = new ArrayList<Integer>();
				    	list.add(nums[pos1]);
				    	list.add(nums[pos2]);
				    	list.add(nums[pos3]);
				    	list.add(nums[pos4]);
				    	Collections.sort(list);
				    	set.add(list);
			    	}
			    }
			}
		}
		
		for(Iterator it=set.iterator();it.hasNext();)
		  {
		  res.add((List<Integer>) it.next());
		  }
		
		return res;
	}
	
	private static boolean not_same(int p1, int p2, int p3, int p4){
		if(p1==p2||p1==p3||p1==p4||p2==p3||p2==p4||p3==p4)
			return false;
		return true;
	}
	
	private static void prinf(List<List<Integer>> res){
		for(List<Integer> l : res){
			for(int a : l){
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}
