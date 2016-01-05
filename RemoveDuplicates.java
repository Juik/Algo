package testAndfun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args){
		RemoveDuplicates rp = new RemoveDuplicates();
		int[] input = {1,2,2,3,3,3,3,4,4,4};
		System.out.println("before remove length is :"+input.length);
		System.out.println(rp.removeDuplicates(input));
	}
	public int removeDuplicates(int[] A) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//		List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<A.length;i++){
        	if(map.containsKey(A[i])==true){
        	System.out.println(A[i]+","+(map.get(A[i])+1));
        	map.put(A[i], map.get(A[i])+1);
        	
        	}
        	else{
        		System.out.println(A[i]+","+1);
        		map.put(A[i], 1);
        	}
        }
        int j = 0;
        int count = 0;
        for(Integer key : map.keySet()){
        	if(map.get(key)>=2){
        		A[j] = key;
        		j++;
        		A[j] = key;
        		j++;
//        		list.add(key);
//        		list.add(key);
        		count += 2;
        	}
        	else{
//        		list.add(key);
        		A[j] = key;
        		j++;
        		count++;
        	}
        		
        }
        
        
		return count;
    }
}
