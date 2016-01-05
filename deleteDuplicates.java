package testAndfun;

import testAndfun.addTwoNum.ListNode;


public class deleteDuplicates {
	public static void main(String args[]){
		deleteDuplicates dp = new deleteDuplicates();
		ListNode head  = new ListNode(3);
		ListNode p1 = new ListNode(3);
		head.next=p1;
		ListNode p2  = new ListNode(3);
		p1.next =  p2;
		ListNode p3 = new ListNode(3);
		p2.next = p3;
		ListNode p4 = new ListNode(13);
		p3.next = p4;
		prinf(head);
		prinf(dp.deleteDup(head));
	}
	
	private static void prinf(ListNode input){
		while(input!=null)	{
			System.out.print(input.val+"->");
			input = input.next;
		}
		System.out.println();
	}
	
	public ListNode deleteDup(ListNode head){
		if(head==null||head.next==null)	return head;//if no head, what should I do?
		ListNode p=head;
		int i=0;
		//System.out.println(p.val+" and "+p.next.val);
		while(p.next != null){
			if(p.val==p.next.val&&p.next.next!=null)	{
				//System.out.println("go first"+p.val);//"^^"+p.next.val+"%%"+p.next.next.val);
				p.next=p.next.next;
				continue;//if this and next equal, we should stay in this in case next.next is equal this
			}
			else if(p.val==p.next.val&&p.next.next==null)	{
				//System.out.println("go second"+p.val);
				p.next=null;
				continue;
			}
			//System.out.println(p.val+" round "+i++);
			p=p.next;
			if(p==null)	break;
		}
		//System.out.print(head.val);
		return head;
	}

	/*
	public ListNode deleteDup(ListNode head){
		if(head.next==null)	return head;
		
		ListNode tmp=head;
		while(tmp.next!=null){
			ListNode tmp2 = tmp;
			while(tmp2!=null){
				if(tmp.val==tmp2.next.val)	{
					if(tmp2.next.next==null)	tmp2.next=null;	
					else	tmp2.next=tmp2.next.next;
					
					}
			}
			tmp = tmp.next;
		}
	}
	
	public void delete(ListNode ln){
		if(ln.next==null)	 ln.next=null;
		else ln.next=ln.next.next;
	}
	
	*/
}
