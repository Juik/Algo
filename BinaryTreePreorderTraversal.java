package testAndfun;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import testAndfun.BinaryTreeInorderTraversal.TreeNode;

public class BinaryTreePreorderTraversal {
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> tree = new ArrayList<Integer>();
        if(root==null)	return tree;
        Stack<TreeNode>	stack = new Stack<TreeNode>();
        TreeNode p= root;
        stack.push(p);
        while(!stack.empty()){
        	TreeNode tmp = stack.pop();//先把根加进去
        	tree.add(tmp.val);
        	if(tmp.right!=null)//如果有right，先把右边加进去，但是沉在stack底部，下一个循环出不来直到所有left都遍历完
        		stack.push(tmp.right);
        	if(tmp.left!=null)//再来left，下一次就会pop出来加进去，然后再判断它的right和left
        		stack.push(tmp.left);
        }
        return tree;
    }
}
