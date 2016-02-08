package testAndfun;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class bullsAndCows {
	public static void main(String[] args){
		bullsAndCows bc = new bullsAndCows();
		String s1 = "1807";
		String s2 = "7810";
		System.out.println(bc.getHint(s1, s2));
	}
	public String getHint(String secret, String guess) {
        String ans = "0A0B";
        int match = 0;
        int cows = 0;
//        String new_s = secret;
//        String new_g = guess;
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i=0;i<secret.length();i++){
        	if(secret.charAt(i)==guess.charAt(i)){
        		match++;
//        		new_s = new_s.substring(0, i)+new_s.substring(i+1, new_s.length());
//        		new_g = new_g.substring(0, i)+new_g.substring(i+1, new_g.length());
        	}
        	else{
        		if(map1.get(secret.charAt(i))==null)
        			map1.put(secret.charAt(i), 1);
        		else
        			map1.put(secret.charAt(i), map1.get(secret.charAt(i))+1);
        		if(map2.get(guess.charAt(i))==null)
        			map2.put(guess.charAt(i), 1);
        		else{
        			map2.put(guess.charAt(i), map2.get(guess.charAt(i))+1);
        			}
        	}
        }
        
        @SuppressWarnings("rawtypes")
		Iterator entries1 = map1.entrySet().iterator();
        while (entries1.hasNext()) {
            @SuppressWarnings("rawtypes")
			Map.Entry entry1 = (Map.Entry) entries1.next();
            Character key1 = (Character)entry1.getKey();
            Integer value1 = (Integer)entry1.getValue();
//            System.out.println("key1= "+key1);
            
            @SuppressWarnings("rawtypes")
			Iterator entries2 = map2.entrySet().iterator();
            while (entries2.hasNext()) {
                @SuppressWarnings("rawtypes")
				Map.Entry entry2 = (Map.Entry) entries2.next();
                Character key2 = (Character)entry2.getKey();
                Integer value2 = (Integer)entry2.getValue();
//                System.out.println("key2= "+key2);
                if(key1==key2)
                	cows += Math.min(value1, value2);
            }
//            System.out.println("next round");
        }
        
        ans = match+"A"+cows+"B";
        return ans;
    }
}
