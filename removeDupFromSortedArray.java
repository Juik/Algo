package testAndfun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class removeDupFromSortedArray {
	public static void main(String args[]){
		removeDupFromSortedArray rd = new removeDupFromSortedArray();
		int[] A={1,2,3,3,4,4,4,4,5,6,7};
		System.out.println(Arrays.toString(A));
		System.out.println(rd.removeDuplicates(A));
		System.out.println(Arrays.toString(A));
	}
	
	public int removeDuplicates(int[] A) {
		int len = A.length;  
        if(len <= 1){  
            return len;  
        }  
        int p = 0, q = 0;  
        while(q < len){  
        	//如果前后相等，后面的指针往后移动
            if(A[p] == A[q]){  
            	//System.out.println("p:"+p+" q:"+q+" "+Arrays.toString(A));
                q++;  
            }else{  
            	//如果后面比前面大，把此时后面指针的值附到前一个值中的第二个（第一个一样的地方）比如题中就是5赋给第二个4
                p++;  
                A[p] = A[q];  
                //System.out.println("p"+p+" q:"+q+" "+Arrays.toString(A));
                q++;  
            }  
        }  
        return p+1;  
		
        /*
         * below is the way of only returning the length after shortening
         * 
         * HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<A.length;i++){
        	if(!map.containsKey(A[i]))	map.put(A[i], 1);
        	else{map.put(A[i], map.get(A[i])+1);}
        }
        Iterator it = map.entrySet().iterator();
        int i=0;
        while(it.hasNext()){
        	Map.Entry entry = (Map.Entry) it.next();  
//        	   Object key = entry.getKey();  
//        	   Object value = entry.getValue();  
//        	   System.out.println("key=" + key + " value=" + value);  
        	//System.out.println(i);	
        	i++;
        }
    return i;
	*/
	}
}
