package testAndfun;

import java.util.ArrayList;
import java.util.List;

public class grayCodes {
	public List<Integer> grayCode(int n) {  
        List<Integer> res = new ArrayList<Integer>();  
        if(n==0) {  
            res.add(0);  
            return res;  
        }  
          
        List<Integer> preRes = grayCode(n-1);  
        res.addAll(preRes);  
        for(int i=preRes.size()-1; i>=0; i--){  
            res.add(preRes.get(i)+(int)Math.pow(2, n-1));  
        }  
        return res;  
    }
	
	
	/*
	public List<Integer> grayCode(int n) {

	
	List<Integer> list = new ArrayList<Integer>();
	 public static void main(String[] args) {
		 grayCodes gc = new grayCodes();
	        int N = 3;
	        System.out.println(gc.gray("", N));
	    }
	 
	public List<Integer> grayCode(int n){
		return gray("",n);
	}
	
    public List<Integer> yarg(String prefix, int n) {
        if (n == 0) {
        	//System.out.println(prefix);
        	int cal = calculate(prefix);
        	list.add(cal);
        }
        else {
            gray(prefix + "1", n - 1);
            yarg(prefix + "0", n - 1);
        }
        return list;
    }  

    // append order n gray code to end of prefix string, and print
    public List<Integer> gray(String prefix, int n) {
        if (n == 0) {
        	//System.out.println(prefix);
        	int cal = calculate(prefix);
        	list.add(cal);
        }
        else {
            gray(prefix + "0", n - 1);
            yarg(prefix + "1", n - 1);
        }
        return list;
    }
    
    private int calculate(String input){
    	int output=0;
    	for(int i=input.length()-1;i>=0;i--){
    		output+=Math.pow(2,i)*(Integer.parseInt(String.valueOf(input.charAt(i))));
    	}
    	return output;
    }
    
	*/
	
	///////////////////another method/////////////////////
	
	/*
	public List<Integer> grayCode(int n){
		List<Integer> list = new ArrayList<Integer>();
		if(n==0)	{
			list.add(0);
			return list;
		}
		for(int i=0;i<Math.pow(2, n);i++){
			list.add(i);
		}
		return list;
	}
	*/
}
