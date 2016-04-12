package testAndfun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BSTorderTra {
	public static void main(String args[]){
		BSTorderTra bs = new BSTorderTra();
		
	}
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null)
            return ret;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode tmp = queue.poll();
                if(tmp.left!=null)
                    queue.add(tmp.left);
                if(tmp.right!=null)
                    queue.add(tmp.right);
                list.add(tmp.val);
                
            }
            ret.add(list);
        }
        return ret;
    } 
}
