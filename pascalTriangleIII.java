package testAndfun;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangleIII {
	public static void main(String[] args){
		pascalTriangleIII pt = new pascalTriangleIII();
		System.out.println(pt.getRow(11));
	}
	
	public List<Integer> getRow(int rowIndex) {
        int len = rowIndex + 1;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<len;i++){
        	if(i==0||i==rowIndex){
        		list.add(1);
        	}
        	else{
        		List<Integer> tmp = getRow(rowIndex-1);
        		list.add(tmp.get(i-1)+tmp.get(i));
        	}
        }
        return list;
    }
}
