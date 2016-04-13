package testAndfun;

import java.util.Iterator;
import java.util.List;

public class ZigzagIterator {
	Iterator<Integer> it1;
	Iterator<Integer> it2;
	int turns;
	
	public ZigzagIterator(List<Integer> v1, List<Integer> v2){
		this.it1 = v1.iterator();
		this.it2= v2.iterator();
		turns=0;
	}
	
	
	
}
