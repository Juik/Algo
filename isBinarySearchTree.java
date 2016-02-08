package testAndfun;

public class isBinarySearchTree {
	//this one is very smart and efficient
	public boolean isValidBST(TreeNode root){
		return helper(root,null,null);
	}
	
	public static boolean helper(TreeNode root, Integer min, Integer max){
		if(root==null)	return true;
		if(max!=null && root.val >= max) return false;
		if(min!=null && root.val <= min) return false;
		
		return helper(root.left,min,root.val) && helper(root.right, root.val, max);
	}
	
	
	//below is simple method but not efficient
	public boolean isBST(TreeNode root){
		if(root == null)
			return true;
		if(root.left!=null && root.left.val > max(root.left))
			return false;
		if(root.right!=null && root.right.val < min(root.right))
			return false;
		return isBST(root.left) && isBST(root.right); 
	}
	
	private int max(TreeNode root){
		int max = root.val;
		while(root.right!=null){
			max = root.right.val;
		}
		return max;
	}
	
	private int min(TreeNode root){
		int min = root.val;
		while(root.left!=null){
			min = root.left.val;
		}
		return min;
	}
	
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val=x;
		}
	}
}
