package testAndfun;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
/*
：least frequently used cache(signature貌似是lruCache)， 
给你一个array of key, 然后一个cache的长度len，array里的key依次被输入，
然后让你求长度为len的cache里key会被replace过几次. 比如len = 2, array是{2,1,3,1}, 
output是1： 2进来存好，1进来存好，3进来发现cache满了，把2踢走，replaceCount++, 
然后1进来，发现已经存在了，就只要update一下lfu的index就行
*/

import testAndfun.kclosestPoints.CPoint;

public class LFUCache {
	HashMap<Integer,Element> map = new HashMap<Integer, Element>();
	Cache cache;
	
	
	private void set(int a){
		if(!map.containsKey(a)){
			map.put(a, new Element(a,map.get(a).freq+1));
			if (cache.queue.contains(map.get(a))){
			Element tmp  =new Element(a, map.get(a).freq+1);
			cache.queue.remove(map.get(a));
			cache.queue.offer(tmp);
			}
			else{
				cache.queue.offer(new Element(a,map.get(a).freq+1));
			}
		}
		else{
			map.put(a, new Element(a,map.get(a).freq+1));
		}
	}
	
}

class Element{
	int key;
	int freq;
	Element(int a, int b){
		this.key =a;
		this.freq =b;
	}
}

class Cache{
	int capacity;
	Comparator<Element> cmp = new Comparator<Element>(){
		@Override
		public int compare(Element o1, Element o2) {
			// TODO Auto-generated method stub
			return o1.freq - o2.freq;
		}
	};
	PriorityQueue<Element> queue = new PriorityQueue<Element>(capacity, cmp);
	
	Cache(int capacity, Element e){
		this.capacity = capacity;
		queue.offer(e);
	}
	
	Cache(int capacity, Element[] arr){
		this.capacity = capacity;
		for(Element e : arr)
			queue.offer(e);
	}
}
