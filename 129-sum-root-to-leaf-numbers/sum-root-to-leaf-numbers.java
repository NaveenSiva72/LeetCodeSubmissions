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
    public int sumNumbers(TreeNode root) {
        return ans(root  , 0); 
    }
    static int ans(TreeNode root  , int currentNum)
    {
        if(root == null)
        {
            return 0;
        }
        currentNum = (currentNum * 10) + root.val;
        if(root.left == null && root.right ==null)
        {
            return currentNum;
        }
        int left = ans(root.left , currentNum);
        int right = ans(root.right , currentNum);
        return left + right;
    }
}