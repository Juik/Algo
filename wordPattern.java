package testAndfun;

import java.util.HashMap;
import java.util.Map;

public class wordPattern {
	 public static void main(String[] args){
//		 String hi = new String("Hello world");
//		 String reverse = new StringBuffer(hi).reverse().toString();
//		 System.out.println(reverse);
		 String str = new String("dog dog cat cat");
		 String pat = new String("aabb");
		 System.out.println(wordpattern(pat,str));
	 }
	
	 public static boolean wordpattern(String pattern, String str) {
	        String[] strs = str.split(" ");
	        if(pattern.length()!=strs.length){
	        	return false;
	        }
	        Map<String, Character> map = new HashMap<String, Character>();
	        for(int i = 0; i<strs.length;i++){
	        	if(!map.containsKey(strs[i])){
	        		map.put(strs[i], pattern.charAt(i));
	        	}
	        	else{
	        		if(!map.get(strs[i]).equals(pattern.charAt(i))){
	        			return false;
	        		}
	        	}
	        }
	        
		 
		 	return true;
	    }
}
