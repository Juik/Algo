package testAndfun;

import java.util.ArrayList;
import java.util.Arrays;

public class sortList {
	public static void main(String args[]){
		sortList dp = new sortList();
		ListNode head  = new ListNode(3);
		ListNode p1 = new ListNode(2);
		head.next=p1;
		ListNode p2  = new ListNode(1);
		p1.next =  p2;
		ListNode p3 = new ListNode(5);
		p2.next = p3;
		ListNode p4 = new ListNode(4);
		p3.next = p4;
		prinf(head);
		prinf(dp.sortList(head));
	}
	
	private static void prinf(ListNode input){
		while(input!=null)	{
			System.out.print(input.val+"->");
			input = input.next;
		}
		System.out.println();
	}
	public ListNode sortList(ListNode head) {
		if(head==null)  return head;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int j=0;
        ListNode p= head;
        while(p!=null){
        	arr.add(p.val);
        	p=p.next;
        }
        Object[] array = arr.toArray();
        Arrays.sort(array);
        ListNode start= new ListNode(0);
        ListNode q = start;
        for(int i=0;i<array.length;i++){
        	q.val=(Integer) array[i];
        	if(i==array.length-1)	{q.next = null;break;}
        	ListNode k = new ListNode(0);
        	q.next=k;
        	q=k;
        }
        return start;
    }
}
