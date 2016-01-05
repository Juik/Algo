package testAndfun;

public class UniquedePaths {
	/*
	int x=0;
	int y=0;
	public int uniquePaths(int m, int n){
		if(x==m-1||y==n-1)	return 1;
		return uniquePaths(m-1,n)+uniquePaths(m,n-1)+2;
	}
	*/
	public int uniquePaths(int m,int n){
	int[][] rec = new int[m][n];
	for(int i=0;i<m;i++)
		rec[i][0]=1;
	for(int j=0;j<n;j++)
		rec[0][j]=1;
	for(int p=1;p<m;p++)
		for(int q=1;q<n;q++)
			rec[p][q]=rec[p-1][q]+rec[p][q-1];
	return rec[m-1][n-1];
}
}