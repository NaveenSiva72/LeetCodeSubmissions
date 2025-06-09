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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return maxHeight(root) != -1;

        // return ans==1 || ans==0;
        
    }

    public int maxHeight(TreeNode root){
        if(root == null) return 0;
        int left = maxHeight(root.left);
        int right = maxHeight(root.right);
        if(left==-1 || right==-1) return -1;
        int diff = Math.abs(left - right);

        if(diff < -1 || diff > 1){
            return -1;
        }

        return 1 + Math.max( left, right);
    }
}