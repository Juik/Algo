package testAndfun;

public class reverseHalfLinkedList {
	public static void main(String[] args){
		reverseHalfLinkedList rh =new reverseHalfLinkedList();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		prinf(n1);
		prinf(rh.reorder(n1));
	}
	
	//loop to len/2 point, and take advantage of reverse() the len-len/2 part
	public Node reorder(Node head){
		if(head==null||head.next==null)
			return head;
		int len = 0;
		Node l  = head;
		while(l!=null){
			len++;
			l= l.next;
		}
		l = head;
		int half = len/2;
		while(half>1){
			l = l.next;
			half--;
		}
		//the rest part reverse
		l.next = reverseList(l.next);
		return head;
	}
	
	//take advantage of reversing linkedlist
	public Node reverseList(Node head) {  
        if(head==null||head.next==null)  
            return head;  
          
        Node second = head.next;  
        head.next=null;  
          
        Node rest = reverseList(second);  
        second.next = head;  
          
        return rest;
	}
	
	private static void prinf(Node h){
		while(h!=null){
			System.out.print(h.val+"->");
			h = h.next;
		}
		System.out.println();
	}
	
	static class  Node{
		int val;
		Node next;
		Node(int x){
			this.val = x;
		}
	}
}
