package testAndfun;

import java.util.HashMap;
import testAndfun.RandomListNode;

public class copyListRandomPo {
//	HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
	public static void main(String[] args){
		copyListRandomPo cr =new copyListRandomPo();
		RandomListNode n1 = new RandomListNode(1);
		RandomListNode n2 = new RandomListNode(2);
		RandomListNode n3 = new RandomListNode(3);
		n1.next = n2;
		n2.next = n3;
		n1.random = n2;
		n3.random = n1;
		prinf(n1);
		RandomListNode new1 = cr.copyRandomList(n1);
		prinf(new1);
	}
	
	private static void prinf(RandomListNode n){
		while(n!=null){
			if(n.random!=null)
				System.out.print(n.label+"("+n.random.label+")"+"->");
			else
				System.out.print(n.label+"->");
			n = n.next;
		}
		System.out.println();
		
	}
	
	private void copyNext(RandomListNode head) {
        while (head != null) {
            RandomListNode newNode = new RandomListNode(head.label);
            newNode.random = head.random;
            newNode.next = head.next;
            head.next = newNode;
            head = head.next.next;
        }
    }

    private void copyRandom(RandomListNode head) {
        while (head != null) {
            if (head.next.random != null) {
                head.next.random = head.random.next;
            }
            head = head.next.next;
        }
    }

    private RandomListNode splitList(RandomListNode head) {
        RandomListNode newHead = head.next;
        while (head != null) {
            RandomListNode temp = head.next;
            head.next = temp.next;
            head = head.next;
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }
        return newHead;
    }
    
	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null) {
            return null;
        }
        copyNext(head);
        copyRandom(head);
        return splitList(head);
    }
}
