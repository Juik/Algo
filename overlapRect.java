package testAndfun;

//
//Given two rectangles, find if the given two rectangles overlap or not.

public class overlapRect {
	public static void main(String[] args){
		rect re1 = new rect(1,1,3,-3);
		rect re2 = new rect(2,2,5,-1);
		overlapRect or = new overlapRect();
		System.out.println(or.check(re1, re2));

	}
	
	public boolean check(rect r1, rect r2){
		if(r1.y2 >= r2.y1 || r2.y2 >= r1.y1)
			return false;
		if(r1.x2 <= r2.x1 || r2.x2 <= r1.x1)
			return false;
		return true;
		
	}
	
	//have to ensure the given points are topleft and bottomright points
	static class rect{
		int x1, y1;
		int x2, y2;
		rect(int a, int b, int c, int d){
			this.x1=a;
			this.y1=b;
			this.x2=c;
			this.y2=d;
		}
		
	}
}
