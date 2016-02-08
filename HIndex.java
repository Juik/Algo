package testAndfun;

import java.util.Arrays;

public class HIndex {
	public static void main(String[] args){
		HIndex hd = new HIndex();
		int[] input = {0};
		System.out.println(hd.hIndex(input));
	}
	
	
	public int hIndex(int[] citations) {
		if(citations.length==0||citations==null) return 0;
		int start=citations.length;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
        	if(citations[i] < start)
        		start--;
        }
        return start;
    }
}
