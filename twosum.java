package testAndfun;

import java.util.HashMap;

public class twosum {
	public static void main(String args[]){
		int[] a={1,23,5,2};
		int aim=3;
		twosum ts = new twosum();
		int n=ts.twoSum(a,aim).length;
		for(int i=0;i<n;i++)
		System.out.println(ts.twoSum(a,aim)[i]);
	}
	
	public int[] twoSum(int[] numbers, int target) {
		int result[] = new int[2];
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i< numbers.length;i++){
			//如果现有的map pool里面已经有了
			if(map.containsKey(target-numbers[i])){
				result[0]=map.get(target-numbers[i]);
				result[1]=i+1;
				break;
			}
			//如果没有，放进map的pool里
			else	map.put(numbers[i],i+1);
		}
		return result;
	}
}
