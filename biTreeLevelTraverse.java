package testAndfun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class biTreeLevelTraverse {
	public static void main(String[] args){
		biTreeLevelTraverse bi = new biTreeLevelTraverse();
		TreeNode n1 = new TreeNode(5);
		TreeNode n2 = new TreeNode(9);
		TreeNode n3 = new TreeNode(15);
		TreeNode n4 = new TreeNode(21);
		TreeNode n5 = new TreeNode(7);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n3.right=n5;
		prinf(bi.levelOrder(n1));
		
	}
	
	private static void prinf(List<List<Integer>> list){
		for(List<Integer> inList : list){
			for(Integer num : inList){
				System.out.print(num+",");
			}
			System.out.println();
		}
	}
	
	
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root==null)
        	return list;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
        	List<Integer> inner_list = new ArrayList<Integer>();
        	int size = queue.size();
        	for(int i=0;i<size;i++){
        		TreeNode tmp = queue.poll();
        		inner_list.add(tmp.val);
        		if(tmp.left!=null)
        			queue.offer(tmp.left);
        		if(tmp.right!=null)
        			queue.offer(tmp.right);
        	}
        	list.add(inner_list);
        }
        Collections.reverse(list);
        return list;
    }
	
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			this.val = x;
		}
	}
}
