package testAndfun;

import java.util.HashMap;
import java.util.HashSet;

/*
 * return the index of the distinct char in the string that only appear once
 */

public class firstTimeChar {
	public static void main(String[] args){
		String input = "abacbc";
		System.out.println(findChar(input));
		
	}
	
	public static int findChar(String str){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++){
			if(map.get(str.charAt(i))==null)
				map.put(str.charAt(i), 1);
			else
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
		}
		for(int i=0;i<str.length();i++){
			if(map.get(str.charAt(i))==1)
				return i+1;
		}
		return -1;
		
	}
	
}
