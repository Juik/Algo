package testAndfun;

import java.util.ArrayList;
import java.util.List;

public class spriralOrder {
	List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args){
		spriralOrder so = new spriralOrder();
		int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
		//int[][] m = {{2,3}};
		System.out.println(so.spiralOrders(m).toString());
		
	}
	public List<Integer> spiralOrders(int[][] matrix) {
		if(matrix.length==0 || matrix[0].length==0)	return list;
        int moveStep = 0;
        int m = matrix[0].length;
        int n = matrix.length;
        int x=0,y=-1;
        while(moveStep!=matrix.length*matrix[0].length){
        	for(int i=0;i<m;i++){
        		list.add(matrix[x][++y]);
        		moveStep++;
        	}
        	if(moveStep==matrix.length*matrix[0].length)	break;
        	for(int i=0;i<n-1;i++){
        		list.add(matrix[++x][y]);
        		moveStep++;
        	}
        	if(moveStep==matrix.length*matrix[0].length)	break;
        	for(int i=0;i<m-1;i++){
        		list.add(matrix[x][--y]);
        		moveStep++;
        	}
        	if(moveStep==matrix.length*matrix[0].length)	break;
        	for(int i=0;i<n-2;i++){
        		list.add(matrix[--x][y]);
        		moveStep++;
        	}
        	n = n-2;
        	m = m-2;
        }
        return list;
    }
}
