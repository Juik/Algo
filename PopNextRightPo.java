package testAndfun;

public class PopNextRightPo {

//	struct TreeLinkNode { 
//	      TreeLinkNode *left; 
//	      TreeLinkNode *right; 
//	      TreeLinkNode *next; 
//	    } 
	
	public class TreeLinkNode{
		int val;
		TreeLinkNode left,right,next;
		TreeLinkNode(int x){
			val = x;
		}
	}
	
	public void connect(TreeLinkNode root) {
//		if(root==null)	return;
//		if(root.left!=null)	root.left=root.right;
//		if(root.right!=null){
//			if(root.next!=null)	root.right.next=root.next.left;
//		}
//		connect(root.left);//递归调用
//		connect(root.right);//递归调用
		if(root == null){  
            return;  
        }  
          
        if(root.left != null){  
//            root.left.next = root.right==null ? null : ;  
        }  
        if(root.right != null){  
            root.right.next = root.next==null ? null : root.next.left;  
        }  
          
        connect(root.left);  
        connect(root.right);  
    }
}
