package testAndfun;

public class oddEvenLinkedList {
	 public static void main(String[] args){
		 oddEvenLinkedList ol = new oddEvenLinkedList();
		 ListNode n1 = new ListNode(1);
		 ListNode n2 = new ListNode(2);
		 ListNode n3 = new ListNode(3);
		 ListNode n4 = new ListNode(4);
		 ListNode n5 = new ListNode(5);
		 ListNode n6 = new ListNode(6);
		 n1.next = n2;
		 n2.next = n3;
		 n3.next = n4;
		 n4.next = n5;
		 n5.next = n6;
		 prinf(n1);
		 ListNode ans = ol.oddEvenList(n1);
		 prinf(ans);
	 }
	 public static void prinf(ListNode head){
		 while(head!=null){
			 System.out.print(head.val+"->");
			 head = head.next;
		 }
		 System.out.println();
	 }
	 
	 public ListNode oddEvenList(ListNode head) {
	        ListNode odd = head;
	        ListNode ret = head;
	        ListNode even = head.next;
	        ListNode backup = even;
	        while(odd.next!=null&&even.next!=null){
	            if(odd.next!=null){
	            odd.next=even.next;
	            odd=odd.next;
	            }
	            if(even.next!=null){
	            even.next=odd.next;
	            even=even.next;
	            }
	        }
	        odd.next = backup;
	        return ret;
	    }
	 
	 
	 static class ListNode{
		 int val;
		 ListNode next;
		 ListNode(int x){
			 this.val = x;
		 }
	 }
}
