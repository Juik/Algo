package testAndfun;

import java.util.Arrays;

public class SortColours {
	public static void main(String args[]){
		SortColours sc = new SortColours();
		int[] A={0,2,1,2,1,1,0,2,1,1,0,2,2,0,1};
		sc.sortColors(A);
		System.out.print(Arrays.toString(A));
	}
	
	public void sortColors(int[] A) {
        int red=0;
        int white=0;
        int blue=0;
        for(int i=0;i<A.length;i++){
        	if(A[i]==0)	red++;
        	if(A[i]==1)	white++;
        	if(A[i]==2)	blue++;
    }
        for(int j=0;j<red;j++)	A[j]=0;
        for(int j=red;j<white+red;j++)	A[j]=1;
        for(int j=red+white;j<blue+red+white;j++)	A[j]=2;
}
}