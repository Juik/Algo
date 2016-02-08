package testAndfun;

public class validNum {
	public static void main(String[] args){
		validNum vn = new validNum();
		System.out.println(vn.isNumber("12"));
	}
	
	public boolean isNumber(String s) {
		if(!isWrongBlank(s))
			return false;
        if(s.contains("e")){
        	System.out.println("goes with exp");
        	int e = locateE(s);
        	return isFloat(s.substring(0,e)) && isInt(s.substring(e+1, s.length()));
        }
        else{
        	return isFloat(s);
        }
    }
	
	public static boolean isWrongBlank(String s){
		for(int i=1;i<s.length()-1;i++){
			if(s.charAt(i)==' '&&s.charAt(i-1)!=' '&&s.charAt(i+1)!=' '){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isInt(String s){
		try{
    		int f = Integer.parseInt(s);
    		return true;
    	}
    	catch(Exception e){
    		return false;
    	}
	}
	
	public static boolean isFloat(String s){
		try{
			
    		float f = Float.parseFloat(s);
    		return true;
    	}
    	catch(Exception e){
    		return false;
    	}
	}
	
	public static int locateE(String s){
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)=='e')
				return i;
		return -1;
	}
	
}
