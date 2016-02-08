package testAndfun;

import java.util.Comparator;
import java.util.PriorityQueue;

public class kclosestPoints {
	public static void main(String[] args){
		kclosestPoints kp = new kclosestPoints();
		CPoint c1 = new CPoint(1,1);
		CPoint c2 = new CPoint(-7,10);
		CPoint c3 = new CPoint(5,3);
		CPoint c4 = new CPoint(4,3);
		CPoint c5 = new CPoint(11,2);
		CPoint c6 = new CPoint(-14,-20);
		CPoint[] input = {c1,c2,c3,c4,c5,c6};
		for(CPoint k : kp.findClose(input, 3)){
			System.out.println(k.x+", "+k.y);
		}
	}
	
	public CPoint[] findClose(CPoint[] arr, int k){
		if(k==0)
			return new CPoint[0];
		Comparator<CPoint> cmp = new Comparator<CPoint>(){
			@Override
			public int compare(CPoint c1, CPoint c2) {
				// TODO Auto-generated method stub
				double d1 = c1.x * c1.x + c1.y*c1.y;
				double d2 = c2.x * c2.x + c2.y*c2.y;
				return  (int) (d1-d2);
			}
		};

		//k is capacity, cmp is an obj implementing Comparator, in which define the compare rules
		PriorityQueue<CPoint> heap = new PriorityQueue<CPoint>(k,  cmp);
		for(CPoint p : arr){
			heap.offer(p);  //offer is to input 
		}	
		
		CPoint[] res = new CPoint[k];
		for(int i=0;i<k;i++){
			res[i] = heap.poll(); //poll first k prior elements
		}
		return res;
		
	}
	
	static class CPoint{
		double x;
		double y;
		public CPoint(double a, double b){
			this.x = a;
			this.y = b;
		}
	}
}
