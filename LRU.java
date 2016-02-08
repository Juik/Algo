package testAndfun;

import java.util.HashMap;

public class LRU {
	//define how many element could contains in the cache
	int capacity;
	//we need a hashmap to ensure every incoming element is unique. 
	//By using hashmap, we can find corresponding Node to move.
	HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	//we need to define the head (latest node) and end (least recent node) 
	Node head = null;
	Node end = null;
	
	public LRU(int capacity) {
		this.capacity = capacity;
	}
    
    public int get(int key) {
    	if(map.containsKey(key)){
    		Node n = map.get(key);
    		
    		remove(n);
    		//let n be the latest element
    		setHead(n);
    	}
		return -1;
    }
    
    private void remove(Node n){
    	if(n.pre!=null){
    		n.pre.next = n.next;
    	}
    	if(n.next!=null){
    		n.next.pre = n.pre;
    	}
    	
    		
    }
    
    private void setHead(Node n){
    	n.next = head;
    	n.pre = null;
    	head.pre = n;
    	head = n;
    	//not sure about below
    	 if(end ==null)
             end = head;
    }
    
    
    public void set(int key, int value) {
        if(map.get(key)!=null){
        	Node old = map.get(key);
        	remove(old);
        	setHead(old);
        }
        else{
        	Node new_ = new Node(key, value);
        	if(map.size() > capacity){
        		map.remove(end.key);
        		remove(end);
        		setHead(new_);
        	}
        	else{
        		setHead(new_);
        	}
        	map.put(key, new_);
        }
        
        	
    }
    
    //define the data structure of a single Node as a double-linkedlist
    class Node{
    	int key;
    	int value;
    	Node pre;
    	Node next;
    	public Node(int k, int v){
    		this.key = k;
    		this.value = v;
    	}
    }
}
