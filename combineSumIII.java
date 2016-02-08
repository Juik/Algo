package testAndfun;

import java.util.ArrayList;
import java.util.List;

public class combineSumIII {
	public static void main(String[] args){
		combineSumIII cs = new combineSumIII();
		int k  = 3;
		int n = 9;
		
		prinf(cs.combinationSum3(k, n));
	}
	
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		
		
		return lists;
    }
	
	public static void prinf(List<List<Integer>> lists){
		for(List list : lists){
			System.out.println(list.toString());
				
		}
	}
}
