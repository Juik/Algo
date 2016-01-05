package testAndfun;

//P              I              N
//A         L  S         I   G
//Y   A       H    R
//P              I

public class zigzagConversion {
	public static void main(String args[]){
		zigzagConversion zz = new zigzagConversion();
		System.out.println(zz.convert("paypalishiring",4));
	}
	public String convert(String s, int nRows) {
		if(s == null || s.length()==0 || nRows <=0)  
	        return "";  
	    if(nRows == 1)  
	        return s;  
	    StringBuilder res = new StringBuilder();  
	    int size = 2*nRows-2;  
	    for(int i=0;i<nRows;i++)  
	    {  
	        for(int j=i;j<s.length();j+=size)  
	        {  
	            res.append(s.charAt(j));  
	            if(i!=0 && i!=nRows-1 && j+size-2*i<s.length())  
	                {
	            	System.out.println("size:"+size+" i:"+i+" j:"+j+" is "+s.charAt(j+size-2*i));
	            	res.append(s.charAt(j+size-2*i));  
	                }
	        }                  
	    }  
	    return res.toString();  
    }
}
