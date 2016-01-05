package testAndfun;

public class addTwoNum {
	public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode x2 = new ListNode(4);
        ListNode x3 = new ListNode(3);
        l1.next = x2;
        x2.next = x3;
         
        ListNode l2 = new ListNode(5);
        ListNode y2 = new ListNode(6);
        ListNode y3 = new ListNode(4);
        l2.next = y2;
        y2.next = y3;
         
        ListNode ret = addTwoNumbers(l1, l2);
        addTwoNum ad = new addTwoNum();
        ad.print(ret);
    }
	
	public void print(ListNode ret) {
		// TODO Auto-generated method stub
		while(ret!=null)	{System.out.print(ret.val);ret=ret.next;}
	}

	static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next=null;
		}
	}
	
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	int carry =0;
    	 
        ListNode newHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3=newHead;
 
        while(p1 != null || p2 != null){
            if(p1 != null){
                carry += p1.val;
                p1 = p1.next;
                System.out.print("carry="+carry);
            }
 
            if(p2 != null){
                carry += p2.val;
                p2 = p2.next;
                System.out.print("carry="+carry);
            }
 
            p3.next = new ListNode(carry%10);
            p3 = p3.next;
            carry /= 10;
        }
 
        if(carry==1) 
            p3.next=new ListNode(1);
 
        return newHead.next;
    }
}