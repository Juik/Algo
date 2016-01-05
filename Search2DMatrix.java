package testAndfun;

public class Search2DMatrix {
	public static void main(String args[]){
		Search2DMatrix sm = new Search2DMatrix();
		int[][] put = {{1,   3,  5,  7},
				  {10, 11, 16, 20},
				  {23, 30, 34, 50}};
		System.out.println(sm.searchMatrix(put, 12));
	}
	public boolean searchMatrix(int[][] matrix, int target) {
		int i=0;
		while(i<matrix.length-1){
			if(target>=matrix[i][0]&&target<matrix[i+1][0]){
				for(int j=0;j<matrix[i].length;j++)
					if(matrix[i][j]==target)	return true;
			}
			i++;
		}
		for(int j=0;j<matrix[matrix.length-1].length;j++){
			if(matrix[matrix.length-1][j]==target)	return true;
		}
		return false;
		}
}
