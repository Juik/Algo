package testAndfun;

public class maxiumSubArray {
	public static void main(String args[]){
		maxiumSubArray ms = new maxiumSubArray();
		int[] A={1,-4,3,-2,3,-1,4,-3,3,2};
		int[] B={-1,-5,-2,-3,-8,-2,-8,-3};
		System.out.println(ms.maxSubArray(B));
	}
	public int maxSubArray(int[] A){
		/*for(int i=1;i<A.length;i++){
		 * sum[i]=Math.max(A[i],A[i]+sum[i-1]);
		 * max = Math.max(max,sum[i]);
		 * }
		 */
				
		int max=A[0];
		int cur=0;
		int flag=0;
		for(int i=0;i<A.length;i++){
			if(A[i]<0)	flag++;
			if(A[i]>cur)	cur=A[i];
			else	cur+=A[i];
			if(cur>max)	max=cur;
		}
		if(flag==A.length)	return 0;
		return max;
	}
}
