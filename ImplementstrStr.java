package testAndfun;

public class ImplementstrStr {
	public static void main(String args[]){
		ImplementstrStr is = new ImplementstrStr();
		String h = "aaa";
		String n = "a";
		System.out.print(is.strStr(h, n));
	}
	
	public int strStr(String haystack, String needle) {
	   if(haystack==null&&needle==null || haystack.length()==0&&needle.length()==0)    return 0;
       if(haystack!=null&&needle.length()==0)  return 0;
	   if(needle==null||needle.length()==0||haystack==null||haystack.length()==0)	return -1;
       if(!haystack.contains(needle))	return -1;
       if(haystack.equals(needle))  return 0;
       for(int i=0;i<haystack.length();i++){
    	   if(haystack.charAt(i)==needle.charAt(0) )
    			   if(match((String) haystack.subSequence(i, haystack.length()),needle))
    			   		return i;
       }
	return -1;
    }
	
	private boolean match(String par, String need){
		//System.out.println(par+"\n"+need);
		for(int j=0;j<need.length();j++){
			if(par.charAt(j)!=need.charAt(j))
				return false;
		}
		return true;
	}
}
