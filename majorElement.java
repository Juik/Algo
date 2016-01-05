package testAndfun;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class majorElement {
	public static void main(String[] args){
		majorElement me = new majorElement();
		int[] input = {1,6,5,5,5,5};
		System.out.println(me.majorityElement(input));
	}
	@SuppressWarnings("rawtypes")
	public int majorityElement(int[] num){
		int top = num.length/2;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<num.length;i++){
			if(map.containsKey(num[i]))
			{
				int tmp = map.get(num[i]);
				tmp++;
				map.put(num[i], tmp);
			}
			else	map.put(num[i], 1);
		}
		
		@SuppressWarnings("rawtypes")
		Iterator it = map.entrySet().iterator();  
		while (it.hasNext()) {  
		Map.Entry entry = (Map.Entry) it.next();  
		   int key = (Integer) entry.getKey();  
		   int value = (Integer) entry.getValue();  
		   System.out.println("value:"+value+"key:"+key);
		   if(value>top)	return key;
	}
		return -1;
	}
	
}
