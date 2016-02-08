package testAndfun;

import java.util.LinkedList;

public class PopNextRightPoII {
	//I guess BFS will work out
	public void connect(TreeLinkNode root) {
        if(root==null)
			return;
		LinkedList<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		queue.offer(root);
		while(queue.size()!=0){
		    int size = queue.size();
			TreeLinkNode pre = null;
			for(int i=0;i<size;i++){
				TreeLinkNode curr = queue.poll();
				if(pre!=null){
					pre.next=curr;
				} 
				pre = curr;
				if(curr.left!=null){
					queue.offer(curr.left);
				}
				if(curr.right!=null){
					queue.offer(curr.right);
				}
			}
			pre.next = null;
		}
    }
	
	
	 public class TreeLinkNode {
		     int val;
		     TreeLinkNode left, right, next;
		     TreeLinkNode(int x) { val = x; }
		 }
}
