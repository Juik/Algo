package testAndfun;

public class LowestCommonAncestorBST {
	
	public static void main(String[] args){
		LowestCommonAncestorBST lca =new LowestCommonAncestorBST();
//		TreeNode n1 = new TreeNode(6);
//		TreeNode n2 = new TreeNode(2);
//		TreeNode n3 = new TreeNode(8);
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val>p.val && root.val<q.val)
        	return root;
        else if(root.val<p.val && root.val<q.val)
        	return lowestCommonAncestor(root.right,p,q);
        else
        	return lowestCommonAncestor(root.left,p,q);
    }
	
	private class TreeNode{
		  int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
}
