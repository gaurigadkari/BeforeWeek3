import java.util.ArrayList;

class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
public class Inorder {
	ArrayList<Integer> inorderResult = new ArrayList<>();
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
        if(a != null){
            recursive(a);
        }
        return inorderResult;
    }
    
    public void recursive(TreeNode a){
        if(a.left != null)
            recursive(a.left);
 
        inorderResult.add(a.val);
 
        if(a.right != null)
            recursive(a.right);
    }
}
