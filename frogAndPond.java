package testAndfun;

public class frogAndPond {
	public static void main(String[] args){
		frogAndPond fap = new frogAndPond();
		int[] A = {1,3,1,4,2,5};
		System.out.println(fap.solution(A, 7, 2));
	} 
	
	 public int solution(int[] A, int X, int D) {
	        // write your code in Java SE 8
	        if(D>X)
	            return 0; //not sure about 0 or 1?
	        int b = A[0];
	        for(int i=1;i<A.length;i++){
	            if(A[i] > b && b + D >= A[i]){
	                b = A[i];
	            }
	            //what is success
	            if(A[i]+D>=X){
	                return i;
	            }
	        }
	        return -1;
	    }
}
