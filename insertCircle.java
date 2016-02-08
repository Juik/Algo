package testAndfun;

public class insertCircle {
	public static void main(String[] args){
		insertCircle ic = new insertCircle();
		Node n1 = new Node(1);
		Node n2 = new Node(3);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(4);
		Node n6 = new Node(7);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n1;
		prinf(n1);
		prinf(ic.insert(n3, 3));
		
	}
	//print circle
	static void prinf(Node c){
		Node start = c;
		System.out.print(c.val+"->");
		c=c.next;
		while(c!=start){
			System.out.print(c.val+"->");
			c = c.next;
		}
		System.out.println();
	}
	
	public Node insert(Node myList, int n){
		Node end = null;
		Node start = null;
		//先找到最小点最大点
		while(myList!=null){
			if(myList.next.val < myList.val){
				 end = myList;
				 start = myList.next;
				break;
			}
			myList= myList.next;
		}
		
		//一定要考虑duplicate的情况
		while(end!=null){
		if(n>=end.val){
			Node tmp = new Node(n);
			tmp.next = end.next;
			end.next = tmp;
			return tmp.next;
		}
		if(start.val >= n){
			Node tmp = new Node(n);
			tmp.next = start;
			end.next = tmp;
			return tmp;
		}
		if(end.val<n&&start.val>=n){
			Node tmp = new Node(n);
			tmp.next = start;
			end.next = tmp;
			return tmp;
		}

		end = start;
		start = start.next;
		}
		return myList;
	}
	
	static class Node{
		int val;
		Node next;
		Node(int a){
			this.val = a;
		}
	}
}
