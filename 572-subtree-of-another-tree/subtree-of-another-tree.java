/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode r, TreeNode s) {

        if(r==null) return false;
        if(isSame(r,s)) return true;

        return isSubtree(r.left , s) || isSubtree(r.right , s);
        
    }

    public boolean isSame(TreeNode r , TreeNode s){
        if(r==null && s==null) return true;
        else if(r==null || s==null) return false;
        else if(r.val!=s.val) return false;

        return isSame(r.left , s.left) && isSame(r.right,s.right);
    }
}