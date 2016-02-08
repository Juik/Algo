package testAndfun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {
//	Queue queue1 = new LinkedList<TreeNode>();
//	Stack stack = new Stack<TreeNode>();
//	Queue queue2 = new LinkedList<TreeNode>();
//	List<Integer> count = new ArrayList<Integer>();

		//This is attribute
		private List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		//this is main entry anyway
	    public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        int length = getTreeLength(root);
	        initList(length);
	        order(root, length - 1);
	        return list;
	    }
	    
	    
	    //Do remember init list firstly and put empty son-list in it. That's helpful
	    private void initList(int length){
	        for(int i = 0; i < length; i++){
	            List<Integer> aList = new ArrayList<Integer>();
	            list.add(aList);
	        }
	    }
	    
	    //obtain the height of the tree, very clever!
	    private int getTreeLength(TreeNode root){
	        if(root == null) return 0;
	        if(root.left == null && root.right == null) return 1;
	        return Math.max(getTreeLength(root.left) + 1, getTreeLength(root.right) + 1);
	    }
	    
	    
	    //very clever. when recursively traverse, just "get" corresponding level's aList from list to add more element. 
	    //Very easy to imagine and pretty accurate. Bravo!
	    private void order(TreeNode root, int level){
	        if(root == null) return;
	        list.get(level).add(root.val);
	        if(root.left != null){
	            order(root.left, level - 1);
	        }
	        if(root.right != null){
	            order(root.right, level -1);
	        }
	    }
	


/*
 * 
	// this is the attempt of dfs. NEGLECT
	 public void dfs(TreeNode root)
	    {
		 	queue1.add(root);
		 	if(root.right!=null)
		 		dfs(root.right);
		 	if(root.left!=null)
		 		dfs(root.left);
		 	if(root.right==null && root.left==null)
		 		return;
	    }

	//c'est le method de bfs
	public void bfs(TreeNode root){
		int cnt = 0;
		
		TreeNode temp;
		
		if (root == null)
	    {
	        return;
	    }
	    queue2.add(root);
	    count.add(1);
	    
	    while (!queue2.isEmpty())
	    {
	        temp = (TreeNode) queue2.poll();
	        stack.push(temp);
	        if (temp.left != null)
	        {
	            queue2.add(temp.left);
	            cnt +=1;
	        }
	        //process the right child after the left if not null
	        if (temp.right != null)
	        {
	            queue2.add(temp.right);
	            cnt+=1;
	        }
//	        stack.push(temp);
	    }
		
	}
	
	*/
	 class TreeNode{
	    	int val;
	    	TreeNode left;
	    	TreeNode right;
	    	TreeNode(int x){
	    		val = x;
	    	}
	    }
	 
}
