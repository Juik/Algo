package testAndfun;

public class maxProductArray {
	public static void main(String[] args){
		maxProductArray mpa = new maxProductArray();
		int[] input = {1,2,-4,-3,-2,7};
		System.out.println(mpa.maxProduct(input));
	}
	public int maxProduct(int[] A) {
		if(A==null || A.length==0)
			return 0;
		if(A.length == 1)
			return A[0];
		int max = A[0];
		int min = A[0];
		int global = A[0];
		//每次我们都取最大值和最小值，与现有值匹配和现有值比，存下最大和最小值即可
		for(int i=1;i<A.length;i++){
			int max_copy = max;
			max = Math.max(Math.max(A[i]*max, A[i]), A[i]*min);
			min = Math.min(Math.min(A[i]*max_copy, A[i]), A[i]*min);
			System.out.println(max+" "+min);
			global = Math.max(global, max);
		}
		return global;
    }
}
