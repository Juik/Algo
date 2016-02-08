package testAndfun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class gourpAnagram {
	public static void main(String[] args){
		gourpAnagram ga = new gourpAnagram();
		String[] strs = {"ate","eat","tea","tan","nat","app"};
		prinf(ga.groupAnagrams(strs));
	}
	
	public static void prinf(List<List<String>> lists){
		for(List<String> list : lists){
			for(String str:list){
				System.out.print(str+" ");
				}
			System.out.println();
		}
	}
	
	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(String s : strs){
        	char[] ar = s.toCharArray();
        	Arrays.sort(ar);
        	String sorted = Arrays.toString(ar);
        	List<String> list = map.get(sorted);
            if (list == null) list = new ArrayList<String>();
            list.add(s);
            map.put(sorted, list);
        }
        Iterator entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            String key = (String)entry.getKey();
            List<String> value = (List<String>)entry.getValue();
            Collections.sort(value);
            lists.add(value);
        }
        
        return lists;
    }
}
