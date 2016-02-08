package testAndfun;

import java.util.HashMap;

public class isomorphicStrings {
	public static void main(String[] args){
		isomorphicStrings is = new isomorphicStrings();
		String s1 = "ab";
		String s2 = "aa";
		System.out.println(is.isIsomorphic(s1, s2));
	}
	
	
	public boolean isIsomorphic(String s, String t) {
		 if(s.length()!=t.length())
				return false;
			HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
			HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
			for(int i=0;i<s.length();i++){
				if(map1.get(s.charAt(i))==null && map2.get(t.charAt(i))==null){
					map1.put(s.charAt(i), i);
					map2.put(t.charAt(i), i);
				}
				else if(map1.get(s.charAt(i))==null || map2.get(t.charAt(i))==null)
					return false;
				else if(map1.get(s.charAt(i)).equals(map2.get(t.charAt(i)))){
					map1.put(s.charAt(i), i);
					map2.put(t.charAt(i), i);
				}
				else{
					return false;
					}
			}
			return true;
	}
}
