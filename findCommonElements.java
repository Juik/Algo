package testAndfun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//given two lists, find common elements;
//follow-up, given two lists, find common elements and they can be replicate and please store the less number of element 
//between two lists
public class findCommonElements {
	public static void main(String[] args){
		findCommonElements fc = new findCommonElements();
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		list1.add(3);
		list1.add(2);
		list1.add(3);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(10);
		list1.add(2);
		list1.add(30);
		list2.add(10);
		list2.add(10);
		list2.add(3);
		list2.add(10);
		list2.add(10);
		list2.add(3);
		System.out.println(Arrays.toString(list1.toArray()));
		System.out.println(Arrays.toString(list2.toArray()));
		System.out.println(Arrays.toString(find(list1,list2).toArray()));
		System.out.println(Arrays.toString(findMore(list1,list2).toArray()));
		
	}
	
	public static List<Integer> find(List<Integer> list1, List<Integer> list2){
		List<Integer> ret = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(Integer m1:list1){
			ret.add(m1);
		}
		for(Integer m2:list2){
			if(ret.contains(m2)){
				set.add(m2);
			}
		}
		return new ArrayList<Integer>(set);
	}
	
	public static List<Integer> findMore(List<Integer> list1, List<Integer> list2){
		List<Integer> ret = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

		for(Integer m1:list1){
			if(!map.containsKey(m1)){
				map.put(m1, 1);
			}
			else{
				map.put(m1, map.get(m1)+1);
			}
		}
		for(Integer m2:list2){
			if(!map2.containsKey(m2)){
				map2.put(m2, 1);
			}
			else{
				map2.put(m2, map2.get(m2)+1);
			}
		}
		
		List<Integer> common = find(list1,list2);
		for(Integer m3 : common){
			int len = Math.min(map.get(m3), map2.get(m3));
			for(int i=0;i<len;i++){
				ret.add(m3);
			}
		}
		return ret;
		
	}
	
}
