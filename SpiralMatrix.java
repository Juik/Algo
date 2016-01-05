package testAndfun;

import java.util.Arrays;

public class SpiralMatrix {
	public static void main(String[] args){
		SpiralMatrix sm = new SpiralMatrix();
		System.out.println(Arrays.deepToString(sm.generateMatrix(3)));
	}
public int[][] generateMatrix(int n) {
		int[][] out = new int[n][n];
        if(n<=0) return out;
        int x=0;
        int y=-1;
        int moveStep = 0;
        while(moveStep != n*n){
        	for(int i=0;i<n;i++){
        		out[x][++y] = ++moveStep;
        	}
        	for(int i=0;i<n-1;i++){
        		out[++x][y] = ++moveStep;
        	}
        	for(int i=0;i<n-1;i++){
        		out[x][--y] = ++moveStep;
        	}
        	for(int i=0;i<n-2;i++){
        		out[--x][y] = ++moveStep;
        	}

        	n = n-2;
        }
        return out;
}
}
