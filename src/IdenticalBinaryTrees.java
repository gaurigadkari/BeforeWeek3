
public class IdenticalBinaryTrees {
	public int isSameTree(TreeNode a, TreeNode b) {
	    boolean left = false, right = false;
	    if(a == null && b == null) {
	        return 1;
	    }
	    if(a != null && b != null) {
	        if(isSameTree(a.left, b.left) == 1) {
	            left = true;
	        }
	        if(isSameTree(a.right, b.right) == 1) {
	            right = true;
	        }
	        if(a.val == b.val && left && right) {
	            return 1;
	        }
	    }
	    
	    return 0;
	}
}
