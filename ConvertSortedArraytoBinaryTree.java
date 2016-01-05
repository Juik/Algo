package testAndfun;

import java.util.Arrays;

public class ConvertSortedArraytoBinaryTree {

	public TreeNode sortedArrayToBST(int[] num) {
        if(num.length==0)	return null;
        else return helper(num, 0, num.length-1);
    }
	
	public TreeNode helper(int[] num, int begin, int end){
		if(begin>end)	return null;
		int mid = (begin+end)/2;
		TreeNode root = new TreeNode(num[mid]);
		root.left = helper(num, begin,mid-1);
		root.right = helper(num,mid+1,end);
		return root;
	}
}
