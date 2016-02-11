package testAndfun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class binaryRightSide {
	 public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> list = new ArrayList<Integer>();
	        if(root==null)
	            return list;
	        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.offer(root);
	        while(!queue.isEmpty()){
	            int size = queue.size();
	            for(int i=0;i<size;i++){
	                TreeNode out = queue.poll();
	                if(out.left!=null)
	                    queue.offer(out.left);
	                if(out.right!=null)
	                    queue.offer(out.right);
	                if(i==size-1){
	                    list.add(out.val);
	                }
	            }
	        }
	        return list;
	    }
}
