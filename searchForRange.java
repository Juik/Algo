package testAndfun;

public class searchForRange {
	public static void main(String[] args){
		searchForRange sr = new searchForRange();
		int input = 8;
		int[] num={1,2,3,4,4,8,4,9,8};
		System.out.println(sr.searchRange(num, input));
	}
	
	public int[] searchRange(int[] A, int target) {
        int[] output = new int[2];
        boolean isFirst = false;
        int first=-1;
        int second=-1;
        for(int i=0;i<A.length;i++){
        	if(A[i]==target&&isFirst==false)
        		{
        		first=i;
        		isFirst = true;
        		}
        	if(A[i]==target&&isFirst==true){
        		second = i;
        	}
        }
        output[0]=first;
        output[1]=second;
        System.out.println(first+" "+second);
        return output;
    }
}
