package testAndfun;

public class LongestCommonPrefix {
	public static void main(String[] args){
		LongestCommonPrefix lm = new LongestCommonPrefix();
		String[] input = {"internet","inspiration","income"};
		System.out.println(lm.longestCommonPrefix(input));
	}
	
	public String longestCommonPrefix(String[] strs) {
        String prefix = new String();
        if(strs.length==0)	return prefix;
        int k=0;
        while(true){
        	if(k==strs[0].length())	break;
        	char p =strs[0].charAt(k);
        	int i=1;
        	for(;i<strs.length;i++){
        		if(k==strs[i].length())	break;
        		if(p!=strs[i].charAt(k))
        			break;
        	}
        	if(i!=strs.length)	break;
        	prefix += p;
        	k++;
        }
        return prefix;
    }
}
