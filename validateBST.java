package testAndfun;

public class validateBST {
	public static void main(String[] args){
		validateBST vb = new validateBST();
		
	}
	
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	public static boolean isValidBST(TreeNode root) {
        if(root==null)
        	return true;
        if(root.left==null&&isValidBST(root.right) || root.right==null&&isValidBST(root.left))
        	return true;
        if(root.left.val<root.val && root.right.val> root.val)
        	return isValidBST(root.left) && isValidBST(root.right);
        else
        	return false;
    }
}
