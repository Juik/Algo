package testAndfun;

import java.util.Arrays;

public class RotateImage {
	public static void main(String args[]){
		RotateImage ri = new RotateImage();
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		ri.rotate(mat);
		prinf(mat);
	}
	
	private static void prinf(int[][] input){
		int l = input.length;
			for(int p=0;p<l;p++){
				for(int q=0;q<l;q++)
					System.out.print(input[p][q]);
				System.out.println();}
	}
	
	public void rotate(int[][] matrix) {
        int len = matrix.length;
        int[][] tmp = new int[len][len];
        for(int i=0;i<len;i++){
        	for(int j=0;j<len;j++){
        		tmp[i][j]=matrix[i][j];
        	}
        }
        
        for(int i=0;i<len;i++)
        	for(int j=0;j<len;j++){
        		matrix[j][len-i-1] = tmp[i][j];
        	}
        	
       }
}
