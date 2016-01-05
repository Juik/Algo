package testAndfun;

public class findPeakElement {
	public static void main(String[] args){
	findPeakElement fpe = new findPeakElement();
	int[] input = {1,1};
		System.out.println(fpe.findPeakElement(input));
	}
	public int findPeakElement(int[] num) {
		int n= num.length;
        if(n==1)    return 0;
        if(n==2)    return (num[0]>num[1])?0:1;
        for(int i=0;i<n;i++){
        	if(i==0)	
        		if(num[0]>num[1])
        			return 0;
        		else
        			continue;
        	if(i==n-1)
        		if(num[i]>num[i-1])
        			return n-1;
        	if(num[i]>num[i-1]&&num[i]>num[i+1])
        		return i;
        }
		return -1;
    }
}
