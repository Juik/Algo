package testAndfun;

import java.util.HashMap;

public class longestSubsequenceWithoutRepeating {
	public static void main(String[] args){
		longestSubsequenceWithoutRepeating lswr = new longestSubsequenceWithoutRepeating();
		String str = "dvdf";
		System.out.println(lswr.lengthOfLongestSubstring(str));
	}
	 
	
	public int lengthOfLongestSubstring(String s) {
		if(s.length()<=1)
            return s.length();
		int Max = 1, start = 0, end = 1;
	    String current = s.substring(start, end);

	    for(int i = 1; i<s.length(); i++){
	    	//if next character has appeared before
	        if(current.indexOf(s.charAt(i)) < 0 ){
	            end = i+1;
	            current = s.substring(start, end);
	        }
	        else{
	        	//if appeared before, we need to update the max if necessary
	            Max = Math.max(Max, end - start);
	            //update start once last one is over
	            start += (current.indexOf(s.charAt(i)) + 1);
	            end = i+1;
	            //current String for matching
	            current = s.substring(start, end);
	        }
	    }
	    //Don't forget about the last round, which is not included within the for loop
	    Max = Math.max(Max, end - start);
	    return Max;
	    }
}
