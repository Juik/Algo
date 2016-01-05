package testAndfun;

public class reverseLL {
	
public static void main(String args[]){
	reverseLL rs= new reverseLL();
	ListNode l1 = new ListNode(3);
	ListNode l2 = new ListNode(5);
//	ListNode l3 = new ListNode(3);
//	ListNode l4 = new ListNode(4);
//	ListNode l5 = new ListNode(5);
	l1.next=l2;
//	l2.next=l3;
//	l3.next=l4;
//	l4.next=l5;
	rs.print(l1);
	rs.reverseBetween(l1, 1, 2);
	rs.print(l1);
}

	public void print(ListNode head){
		while(head!=null){
			System.out.print(head.val+"->");
			head=head.next;
		}
		System.out.println();
	}
	
	
	
//	Given 1->2->3->4->5->NULL, m = 2 and n = 4,
//
//			return 1->4->3->2->5->NULL.
	
	    public ListNode reverseBetween(ListNode head, int m, int n) {
	       ListNode mNode = head;
	       ListNode nNode = head;
	       ListNode mPre = new ListNode(0);
	       
	       //let n be position n-1, m be m-1, mPre be m-2
	       for(int i=0;i<n-m;i++)	nNode=nNode.next;
	       for(int j=0;j<m-1;j++){
	    	   mPre = mNode;
	    	   mNode=mNode.next;
	    	   nNode=nNode.next;
	       }
	       
	       //if from the head, solution would be different
	       if(mNode==head)	{
	    	   while(mNode!=nNode){
	    	   mPre=mNode;
	    	   mNode=mNode.next;
	    	   mPre.next=nNode.next;
	    	   nNode.next=mPre;
	    	   }
	    	   return mNode;
	       }
	       
	       //normal way of reversing
	       while(mNode!=nNode){
	    	   ListNode tmp = mPre;
	    	   tmp.next=mNode.next;
	    	   mNode.next=nNode.next;
	    	   nNode.next=mNode;
	    	   mNode=mPre.next;
	    	   
	       }
	       
	       return head;
	       }
	    	
	    	
	}
