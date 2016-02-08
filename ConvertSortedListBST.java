package testAndfun;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListBST {
	
	public TreeNode sortedListToBST(ListNode head) {
		if(head==null)
				return null;
		List<Integer> list = new ArrayList<Integer>();
        while(head!=null){
        	list.add(head.val);
        	head = head.next;
        }
        int[] ret = new int[list.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = list.get(i).intValue();
        }
        
        return helper(ret,0,ret.length-1);
    }
	
	public TreeNode helper(int[] nums, int begin, int end){
		if(begin>end)	return null;
		int mid = (begin+end)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = helper(nums,begin, mid-1);
		root.right = helper(nums,mid+1,end);
		return root;
	}
	
	class TreeNode{
		int val;
		TreeNode right;
		TreeNode left;
		TreeNode(int x){
			this.val = x;
		}
	}
}

