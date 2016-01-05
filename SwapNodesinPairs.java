package testAndfun;

public class SwapNodesinPairs {
	public static void main(String args[]){
		SwapNodesinPairs dp = new SwapNodesinPairs();
		ListNode head  = new ListNode(1);
		ListNode p1 = new ListNode(2);
		head.next=p1;
		ListNode p2  = new ListNode(3);
		p1.next =  p2;
		ListNode p3 = new ListNode(4);
		p2.next = p3;
		ListNode p4 = new ListNode(5);
		p3.next = p4;
		prinf(head);
		prinf(dp.swapPairs(head));
	}
	
	private static void prinf(ListNode input){
		while(input!=null)	{
			System.out.print(input.val+"->");
			input = input.next;
		}
		System.out.println();
	}

	public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)	return head;
        ListNode p=head;
        ListNode start = head.next;
        while(p!=null&&p.next!=null){
        	ListNode nxt = p.next;
        	//如果后面四个都有，2连向1，1连向4，4连向3，然后切记让下一轮的p得等于3（但是由于这个算法会跳过3，所以提前存好3）
        	if(p.next.next!=null&&p.next.next.next!=null){
        	p.next=nxt.next.next;
        	ListNode tmp = nxt.next;//提前存好3
        	nxt.next=p;
        	p=tmp;//让下一个p等于3，如果p.next的话下一个就是4了，而且3被永远跳过了
        	}
        	//如果后面有三个，就是这一对完了，还剩一个，那么最后那个不动，这两个交换
        	else if(p.next.next!=null&&p.next.next.next==null){
        		p.next=nxt.next;
        		nxt.next=p;
        		p=p.next;
        	}
        	//就剩最后两个，自己交换即可
        	else if(p.next.next==null){
        		nxt.next=p;
        		p.next=null;
        	}
        }
        return start;
    }
}
