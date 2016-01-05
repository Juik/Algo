package testAndfun;

import java.util.Stack;

public class IntersectionofTwoLinkedLists {
	public static void main(String args[]){
		IntersectionofTwoLinkedLists it = new IntersectionofTwoLinkedLists();
		  ListNode l11 = new ListNode(1);
		  ListNode l12 = new ListNode(3);
		  l11.next = l12;
		  ListNode l13 = new ListNode(4);
		  l12.next = l13;
		  
		  ListNode l21 = new ListNode(2);
		  ListNode l22 = new ListNode(3);
		  l21.next = l22;
		  ListNode l23 = new ListNode(4);
		  l22.next = l23;
		  prinf(l11);
		  prinf(l21);
		  System.out.println((it.getIntersectionNode(l11, l21).val));
	  }
	  
	 private static void prinf(ListNode head){
		 while(head!=null)	{
			 System.out.print(head.val+"->");
			 head=head.next;
		 }
		 System.out.println();
	 }

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		if(headA==null||headB==null)	return null;
        Stack<ListNode>	stackA = new Stack<ListNode>();
        Stack<ListNode>	stackB = new Stack<ListNode>();
		Stack<ListNode>	stackC = new Stack<ListNode>();
        ListNode a = headA;
        ListNode b = headB;
        int i=1,j=1;
		while(a.next!=null)	{
			stackA.push(a);
			a=a.next;
			i++;
		}
		stackA.push(a);
		while(b.next!=null){
			stackB.push(b);
			b=b.next;
			j++;
		}
		stackB.push(b);
		if(a.val!=b.val)	return null;
		
		while(i>0&&j>0){
			ListNode bottomA=stackA.pop();
			ListNode bottomB=stackB.pop();
			if(bottomB.val==bottomA.val)	
				{
				stackC.push(bottomA);
				i--;
				j--;
				}
			else	{
				return stackC.pop();
			}
		}
		if(i==0)	return headA;
		else return headB;
    }
}
