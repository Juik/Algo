package testAndfun;

import java.util.ArrayDeque;
import java.util.Queue;


public class KthSmallestEle {
	Queue<Integer> queue = new ArrayDeque<Integer>();
    
	
    public int kthSmallest(TreeNode root, int k){
        foo(root);
        while(k>1){
            queue.poll();
            k--;
        }
        return queue.poll();
    }
    
    public void foo(TreeNode root) {
    	 if(root.left!=null){
             foo(root.left);
             queue.add(root.val);
             if(root.right!=null){
                 foo(root.right);
             }
         }
         else{
             queue.add(root.val);
             if(root.right!=null){
                 foo(root.right);
             }
         }
    }
    
    class TreeNode{
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x){
    		val = x;
    	}
    }
}
