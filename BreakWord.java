package testAndfun;

import java.util.HashSet;
import java.util.Set;

public class BreakWord {
	public static void main(String args[]){
		BreakWord bw = new BreakWord();
		Set<String> dict = new HashSet<String>();
        //dict.add("leet");
        //dict.add("code");
        //dict.add("programcree");
        //dict.add("program");
        dict.add("creek");
        System.out.println(bw.wordBreak("programmcreek",dict));
	}
	
	
	public boolean wordBreak(String s, Set<String> dict) {
        boolean[] t = new boolean[s.length()+1];
        t[0] = true; //set first to be true, why?
        //Because we need initial state
 
        for(int i=0; i<s.length(); i++){
            //should continue from match position
            if(!t[i]) 
                continue;
 
            for(String a: dict){
                int len = a.length();
                int end = i + len;
                if(end > s.length())
                    continue;
 
                if(t[end]) continue;
 
                if(s.substring(i, end).equals(a)){
                    t[end] = true;
                }
            }
        }
 
        return t[s.length()];
    }
	/*
	    public boolean wordBreak(String s, Set<String> dict) {
	        return wordBreakHelper(s, dict, 0);
	    }
	    public boolean wordBreakHelper(String s, Set<String> dict, int start){
	    	if(start==s.length())	return true;
	    	for(String str:dict){
	    		int len=str.length();
	    		int end = start+len;
	    	
	    	if(end>s.length())	continue;
	    	if(s.substring(start,end).equals(str))
	    		if(wordBreakHelper(s,dict,end))
	    			return true;
	    }
	    	return false;
	    }
	    */
}
