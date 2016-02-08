package testAndfun;



public class mergeTwoSortedList {
	
	  public static void main(String args[]){
		  
		  mergeTwoSortedList mt = new mergeTwoSortedList();
		  
		  ListNode l11 = new ListNode(1);
		  ListNode l12 = new ListNode(3);
		  l11.next = l12;
		  ListNode l13 = new ListNode(4);
		  l12.next = l13;
		  
		  ListNode l21 = new ListNode(2);
		  ListNode l22 = new ListNode(4);
		  l21.next = l22;
		  ListNode l23 = new ListNode(6);
		  l22.next = l23;
		  prinf(l11);
		  System.out.println();
		  prinf(l21);
		  System.out.println();
		  prinf(mt.mergeTwoLists(l11, l21));
	  }
	  
	 private static void prinf(ListNode head){
		 while(head!=null)	{
			 System.out.print(head.val+"->");
			 head=head.next;
		 }
	 }
	 
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		 ListNode fakeHead = new ListNode(0);
		 ListNode cur = fakeHead;
		 while(l1!=null && l2!=null){
			 if(l1.val > l2.val){
				 cur.next = l2;
				 l2 = l2.next;
			 }
			 else{
				 cur.next = l1;
				 l1 = l1.next;
			 }
			 cur = cur.next;
		 }
		 //还要考虑剩下没完的list，比如1-2-3和9-10，cur=1-2-3，但是9-10还没动呢，要再来个cur.next = l1/2。
		 if(l1!=null){
			 cur.next = l1;
		 }
		 else{
			 cur.next = l2;
		 }
		 return fakeHead.next;
	 } 
	 
	 
	 
	
	public ListNode mergeTwoLists_(ListNode l1, ListNode l2) {
		ListNode p1 = l1;
        ListNode p2 = l2;
 
        ListNode fakeHead = new ListNode(0);
        ListNode p = fakeHead;
 
        while(p1 != null && p2 != null){
          if(p1.val <= p2.val){
              p.next = p1;
              p1 = p1.next;
          }else{
              p.next = p2;
              p2 = p2.next;
          }
 
          p = p.next;
        }
 
        if(p1 != null)
            p.next = p1;
        if(p2 != null)
            p.next = p2;
 
        return fakeHead.next;
		
	}

}
