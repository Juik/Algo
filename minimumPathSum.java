package testAndfun;

public class minimumPathSum {
	public int minPathSum(int[][] grid) {
	if(grid==null||grid.length==0)	return 0;
	
    int[][] sum = new int[1000][1000];
    sum[0][0]=grid[0][0];
    
    for(int i=1;i<grid.length;i++)
    	sum[i][0]=sum[i-1][0]+grid[i][0];
    
    for(int j=1;j<grid[0].length;j++)
    	sum[0][j]=sum[0][j-1]+grid[0][j];
    
    for(int i=1;i<grid.length;i++)
    	for(int j=1;j<grid[0].length;j++)
    		sum[i][j]=grid[i][j]+Math.min(sum[i-1][j], sum[i][j-1]);
    	
    return sum[grid.length-1][grid[0].length-1];
    
    }
	
}
