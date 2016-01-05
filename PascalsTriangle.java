package testAndfun;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<Integer> pre = new ArrayList<Integer>() ;
		List<List<Integer>> zList = new ArrayList<List<Integer>>();
		if(numRows<=0)	return zList;
		
		pre.add(1);
		zList.add(pre);

		for(int i=1;i<numRows;i++){
			List<Integer> cur =  new ArrayList<Integer>();
			cur.add(1);
			for(int j=0;j<pre.size()-1;j++){
				cur.add(pre.get(j)+pre.get(j+1));
			}
			cur.add(1);
			zList.add(cur);
			pre = cur;
		}
		return zList;
    }
}
