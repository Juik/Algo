package testAndfun;

import java.util.Arrays;

public class reverseWordsInStringII {
	public static void main(String args[]){
		reverseWordsInStringII rs = new reverseWordsInStringII();
		char[] input = {'I',' ','L','o','v','e',' ','m','a','t','h'};
//		char[] input = {'a',' ','b'};
		rs.reverseWords(input);
		
	}
	
/*	
	 public void reverseWords(char[] s) {
//		 System.out.println(s.length);
		 String str = String.copyValueOf(s);
		 System.out.println(str);
		 String strs[] = str.split(" ");
		 for(int i=0;i<strs.length/2;i++){
			 String tmp = strs[strs.length-i-1];
			 strs[strs.length-i-1] = strs[i];
			 strs[i] = tmp;
		 }
		 StringBuffer sb = new StringBuffer();
		 for(String ss : strs){
			 sb.append(ss).append(" ");
		 }
		 s = sb.toString().substring(0, sb.toString().length()-1).toCharArray();
		 System.out.println(s);
	 }
*/	
	 
	    public static void reverse(char[] s, int start, int end) {
	        for (int i = start, j = end; i < j; i++, j--) {
	            char tmp = s[i];
	            s[i] = s[j];
	            s[j] = tmp;
	        }
	    }

	    public static void reverseWords(char[] s) {
	    	System.out.println(s);
	        int len = s.length, i, j;
	        reverse(s, 0, len - 1);
	        for (i = 0, j = 0; j < len; j++) {
	            if (s[j] == ' ') {
	                reverse(s, i, j - 1);
	                System.out.println(s);
	                i = j + 1;
	            }
	        }
	        reverse(s, i, len - 1);
	    	System.out.println(s);
	    }
	
}
