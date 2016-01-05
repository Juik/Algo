package testAndfun;

public class setMatrixZeroes {
	public static void main(String[] args){
		setMatrixZeroes smz = new setMatrixZeroes();
		int[][] mat={{0,1}};
		smz.setZeroes(mat);
		System.out.println(mat.toString());
	}
	public void setZeroes(int[][] matrix) {
		boolean zeroCol = false;
		boolean zeroRow = false;
		int len1 = matrix.length;//len1 is row
		int len2 = matrix[0].length;//len2 is column
		
		for(int i=0;i<len1;i++){
			if(matrix[i][0]==0)
				zeroCol = true;
		}
		
		for(int j=0;j<len2;j++){
			if(matrix[0][j]==0)
				zeroRow = true;
		}
		
		for(int i=1;i<len1;i++){
			for(int j=1;j<len2;j++)
			{
				if(matrix[i][j]==0){
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		
		for(int i=1;i<len1;i++){
			for(int j=1;j<len2;j++){
				if(matrix[0][j]==0||matrix[i][0]==0)
					matrix[i][j]=0;
			}
		}
		
		if(zeroCol==true)
			for(int i=0;i<len1;i++){
				matrix[i][0]=0;
			}
		
		if(zeroRow==true)
			for(int j=0;j<len2;j++){
				matrix[0][j]=0;
			}
    }
}
	