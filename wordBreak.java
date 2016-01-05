package testAndfun;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordBreak {
	List<String> result;
    public List<String> wordbreak(String s, Set<String> wordDict) {
        result = new ArrayList<String>();
        int n = s.length();
        List<Integer>[] pointer = new List[n];
        for(int i=0;i<n;i++) pointer[i]=new ArrayList<Integer>();
        //DP to record break point
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(wordDict.contains(s.substring(j,i+1))&&(j==0||pointer[j-1].size()>0))
                    pointer[i].add(j);
            }
        }
        helper(pointer, s, n-1, "");
        return result;
    }
    
    //DFS to retrieve results
    public void helper(List<Integer>[] pointer, String s, int i, String pattern){
        if(i<0){
            result.add(pattern);
            return;
        }
        for(Integer item:pointer[i]){
            String nextPattern = pattern.length()==0?s.substring(item,i+1):s.substring(item,i+1)+" "+pattern;
            helper(pointer, s, item-1, nextPattern);
        }
    }
	
	
	
	public static void main(String[] args){
		wordBreak wb = new wordBreak();
		Set<String> h = new HashSet<String>();
		h.add("cat");
		h.add("sand");
		h.add("cats");
		h.add("dog");
		h.add("crocodile");
		h.add("and");
		h.add("og");
		System.out.println(wb.wordbreak("catsanddog", h));
	}
	
	
	
	/*
	public List<String> wordbreak(String s, Set<String> wordDict) {
        List<String> list = new ArrayList<String>();
        for(String word : wordDict){
        	String info = new String();
//        	System.out.println(info);
//        	System.out.println("word: "+word);
//        	System.out.println("substring: "+s.substring(0,word.length()));
        	if(word.length()>s.length()) continue;
        	if(word.equals(s.substring(0,word.length()))){
//        		System.out.println(word);
        		info=word+" ";
        		if(word.length()==s.length()){
        			list.add(info);
        		}
        		else{
        		Set<String> newDict = delete(wordDict, word);
        		wordbreak(s.substring(word.length()), newDict);
        		}
        	}
        }
        
        return list;
    }
	
	private static Set<String> delete(Set<String> strs, String s){
		if(!strs.contains(s))
			return strs;
		strs.remove(s);
		return strs;
	}
	*/
}
