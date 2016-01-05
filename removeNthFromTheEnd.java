package testAndfun;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
}

public class removeNthFromTheEnd {
	public static void main(String[] args){
		removeNthFromTheEnd rne = new removeNthFromTheEnd();
		ListNode x1 = new ListNode(2);
        ListNode x2 = new ListNode(4);
        ListNode x3 = new ListNode(3);
        ListNode x4 = new ListNode(7);
        ListNode x5 = new ListNode(19);
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;
        prinf(x1);
        System.out.println();
		prinf(rne.removeNthFromEnd(x1, 1));
	}
	
	public static void prinf(ListNode head){
		while(head!=null){
			System.out.print(head.val+"->");
			head=  head.next;
		}
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode lenTmp = head;
        int len = 0;
        while(lenTmp!=null){
        	len++;
        	lenTmp = lenTmp.next;
        }
        
        if(len==n){
        	head = head.next;
        	return head;
        }
        
        for(int i=0;i<n;i++){
        	p = p.next;
        }
        ListNode pp = head;
        while(p.next!=null){
        	p=p.next;
        	pp = pp.next;
        }
        ListNode tmp = pp.next.next;
        pp.next = tmp;
        return head;
    }
}
