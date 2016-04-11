package testAndfun;

public class reverseLL {
	
public static void main(String args[]){
	reverseLL rs= new reverseLL();
	ListNode l1 = new ListNode(1);
	ListNode l2 = new ListNode(2);
	ListNode l3 = new ListNode(3);
	ListNode l4 = new ListNode(4);
	ListNode l5 = new ListNode(5);
	l1.next=l2;
	l2.next=l3;
	l3.next=l4;
	l4.next=l5;
	rs.print(l1);
	rs.print(rs.reverseList(l1));
}

	public void print(ListNode head){
		while(head!=null){
			System.out.print(head.val+"->");
			head=head.next;
		}
		System.out.println();
	}
	
	public ListNode reverseList(ListNode head){
		if(head==null||head.next==null)
			return head;
		ListNode newHead= null;
		while(head!=null){
			ListNode next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}
	
//	public ListNode reverseList2(ListNode head){
//		
//	}
	
	
	
	    	
}
