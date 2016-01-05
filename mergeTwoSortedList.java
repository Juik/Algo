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
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
//		if(l1==null&&l2!=null)	return l2;
//		if(l1!=null&&l2==null)	return l1;
//        ListNode first;
//        ListNode head;
//        
//        //put first value into head firstly
//        if(l1.val>l2.val)	{
//        	first = new ListNode(l2.val);
//        	l2=l2.next;
//        }
//        else{
//        	first = new ListNode(l1.val);
//        	l1=l1.next;
//        }
//        
//        head = first;
//        //compare and merge then
//        System.out.println(l1.val);
//        System.out.println(l2.val);
//        while(l1!=null||l2!=null){
//        	if(l1.val>l2.val){
//        		ListNode tmp = new ListNode(l2.val);
//        		head.next=tmp;
//        		l2=l2.next;
//        	}	
//        	else{
//        		ListNode tmp = new ListNode(l1.val);
//        		head.next = tmp;
//        		l1=l1.next;
//        	}
//        	head = head.next;
//        }
//        
//        //put the rest of chain into the list
//        if(l1==null){
//        	while(l2!=null){
//        		ListNode tmp = new ListNode(l2.val);
//        		head.next=tmp;
//        		l2=l2.next;
//        	}
//        }
//        else{
//        	while(l1!=null){
//        		ListNode tmp = new ListNode(l1.val);
//        		head.next = tmp;
//        		l1=l1.next;
//        	}
//        }
//        return first;
//    }
}
