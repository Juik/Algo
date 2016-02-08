package testAndfun;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class validAnagram {
	public static void main(String args[]){
		validAnagram va = new validAnagram();
		String str1 = "iss";
		String str2 = "sii";
		System.out.println(va.isAnagram(str1, str2));
	}
	
	
	public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        return equal(ss,tt);
    }
	
	private static boolean equal(char[] a, char[] b){
		if(a.length != b.length)
			return false;
		for(int i=0;i<a.length;i++){
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}
	/*
	public boolean isAnagram2(String s, String t){
		if(s.length() != t.length())
			return false;
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++){
			if(map1.get(s.charAt(i))==null)
				map1.put(s.charAt(i), 1);
			else
				map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
			if(map2.get(s.charAt(i))==null)
				map2.put(s.charAt(i), 1);
			else
				map2.put(s.charAt(i),map2.get(s.charAt(i))+1);
		}
		return map1.equals(map2);
	}
	
	*/
}
