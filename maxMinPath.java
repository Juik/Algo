package testAndfun;

import java.util.Arrays;
/*
Maximum Minimum Path
给一个int[][]的matirx，对于一条从左上到右下的path p_i，p_i中的最小值是m_i，求所有m_i中的最大值。只能往下或右
比如:
[8, 4, 7]
[6, 5, 9]
有3条path：
8-4-7-9 min: 4
8-4-5-9 min: 4
8-6-5-9 min: 5
return: 5
*/

public class maxMinPath {
	int max;
	
	public static void main(String[] args){
		maxMinPath mmp = new maxMinPath();
		int[][] input={{8,4,7},{6,5,9}};
		System.out.println(mmp.maxMin(input));
	}
	
	public int maxMin(int[][] matrix){
		if(matrix==null||matrix.length==0||matrix[0].length==0)
			return 0;
		max = Integer.MIN_VALUE;
		dfs(matrix,0,0,Integer.MAX_VALUE);
		return max;
		
	}
	
	private void dfs(int[][] mat, int i, int j, int minSoFar){
		int m = mat.length , n = mat[0].length;
		//base case: reach out of bottom right
		if(i==m||n==j)
			return;
		//every new step, evaluate current node and previous min
		minSoFar = Math.min(mat[i][j], minSoFar);
		//when reach final grid, return the bigger one 
		if(i==m-1 && j==n-1) {
            max = Math.max(minSoFar, max);
		} 
		
		dfs(mat, i+1, j, minSoFar);
		dfs(mat, i, j+1, minSoFar);
		
	}
	
	
	//事实证明就是不行，哼哼，DP对这题不友好
	public int dp(int[][] matrix){
		int max = Integer.MIN_VALUE;
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] res= new int[m][n];
		res[0][0] = matrix[0][0];
		
		for(int i=1;i<m;i++){
			res[i][0] = Math.min(res[i-1][0],matrix[i][0]);
		}
		for(int j=1;j<n;j++){
			res[0][j] = Math.min(res[0][j-1], matrix[0][j]);
		}
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				res[i][j] = Math.min(Math.min(res[i][j-1],res[i-1][j]),res[i][j]);
				if(i==m-1&&j==n-1){
					max = res[i][j] > max? res[i][j]:max;
				}
			}
		}
		return max;
	}
}
