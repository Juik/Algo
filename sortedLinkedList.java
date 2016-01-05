package testAndfun;

public class sortedLinkedList {
	class ListNode {
		int val;
		ListNode next;
	 
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next == null)
        	return head;
        ListNode newHead = new ListNode(head.val);
        ListNode pointer = head.next;
        
        while(pointer!=null){
        	ListNode innerPointer = newHead;
        	ListNode next = pointer.next;
        		if(pointer.val<=newHead.val){
        			ListNode oldHead = newHead;
        			newHead = pointer;
        			newHead.next = oldHead;
        		}
        		else{
        			while(innerPointer.next!=null){
        				if(pointer.val>innerPointer.val && pointer.val <= innerPointer.next.val){
        					pointer.next = innerPointer.next;
        					innerPointer.next = pointer;
        				}
        				innerPointer = innerPointer.next;
        			}
        			if(innerPointer.next==null && innerPointer.val<pointer.val){
        				innerPointer.next = pointer;
        				pointer.next = null;
        			}
        		}
        		pointer = next;
        }
        return newHead;
    }
}
