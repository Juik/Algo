package testAndfun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class countMiss {
	public static void main(String[] args){
		countMiss cm = new countMiss();
		int[] input = {1,2,1,3,4,5,1};
		System.out.println(cm.count(input, 4));
	}

	public int count(int[] arr, int size){
		if(size==0||arr==null||arr.length==0)
			return 0;
		List<Integer> list = new ArrayList<Integer>();
		int cnt = 0;
		for(int i=0;i<arr.length;i++){
			if(list.size() < size){ //还没装满
				if(list.contains(arr[i])){ //还没装满已经有重复的话，
					list.remove(new Integer(arr[i]));
					list.add(arr[i]);
				}
				else{
					cnt++;
					list.add(arr[i]);
				}
			}
			else{//装满了的情况
				if(list.contains(arr[i])){ //还没装满已经有重复的话，
					list.remove(new Integer(arr[i]));
					list.add(arr[i]);
				}
				else{
					cnt++;
					list.remove(0);
					list.add(arr[i]);
				}
			}
			System.out.println(list.toString());
		}
		
		return cnt;
	}
}
