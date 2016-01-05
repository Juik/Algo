package testAndfun;
//
public class LLCycle {
	
	
	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
		class ListNode{
			int val;
			ListNode next;
			ListNode(int x){
				val = x;
				next=null;
			}
		}
	
	    public boolean hasCycle(ListNode head) {
	    	if(head==null||head.next==null)	return true;
	    	ListNode slow=head;
	    	ListNode fast=head;
	        while(true){
	        	
	        	if(fast==null||fast.next==null)	return true;
	        	slow=slow.next;
	        	fast=fast.next.next;
	        	if(fast==slow)	return false;
	        	
	        	
	        }
	    }
	
	
}
