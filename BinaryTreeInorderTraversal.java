package testAndfun;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> tree = new ArrayList<Integer>();
        if(root==null)	return tree;
        Stack<TreeNode>	stack = new Stack<TreeNode>();
        TreeNode p=root;
        while(!stack.empty()||p!=null){
        	if(p!=null)	{
        		stack.push(p);
        		p=p.left;
        	}
        	else{
        	tree.add(stack.pop().val);
        	p=stack.pop().right;
        	}
        }
        return tree;
    }
}
