package testAndfun;

public class FindMinRotatedSortedArr {
	public int findMin(int[] num) {
        for(int i=0;i<num.length-1;i++){
        	if(num[i]>num[i+1])	return num[i+1];
        }
        return num[0];
    }
}
