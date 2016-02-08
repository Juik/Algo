package testAndfun;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class singleNumberIII {
	public static void main(String[] args){
		singleNumberIII sn = new singleNumberIII();
		int[] input = {-1,0};
		prinf(sn.singleNumber(input));
	}
	
	public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],2);
            else
                map.put(nums[i],1);
        }
        
        int[] res = new int[2];
        int i = 0;
        Iterator entries = map.entrySet().iterator();
        while (entries.hasNext()) {
        	Map.Entry entry = (Map.Entry) entries.next();
            Integer key = (Integer)entry.getKey();
            Integer value = (Integer)entry.getValue();
            if(value==1)
            	res[i++] = key;
        }
    return res;
	}
	
	private static void prinf(int[] input){
		System.out.println(input[0]+" "+input[1]);
	}
}
