package testAndfun;

import java.util.Stack;


	class TreeNode{
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
    	val = x;
    	}
	}

public class pathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
	    if (root == null) {
	        return false;
	    } else {
	        if (root.left == null && root.right == null) {
	            return sum == root.val;
	        } else {
	            int subSum = sum - root.val;
	            return hasPathSum(root.left, subSum) || hasPathSum(root.right, subSum);
	        }
	    }
	}
	
	/*
	bool solution2(TreeNode *n, int sum){
    if(!n) return false;
    stack<TreeNode *> st;
    TreeNode *cur = n, *pre;
    while(cur || !st.empty()){
        while(cur){
            st.push(cur);
            sum -= cur->val;
            cur = cur->left;
        }
        cur = st.top();
        if(!cur->left && !cur->right && !sum) return true;
        if(cur->right && pre != cur->right) cur = cur->right;
        else{
            st.pop();
            sum += cur->val;
            pre = cur;
            cur = NULL;
        }
    }
    return false;
}
	
	*/
}
