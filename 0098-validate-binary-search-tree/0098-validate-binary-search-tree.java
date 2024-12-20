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
    public boolean isValidBST(TreeNode root) {
       return validBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean validBST(TreeNode node,long lower,long upper)
    {
      if(node==null)
      return true;
      if(node.val <=lower || node.val >=upper)
      return false;
      return validBST(node.left,lower,node.val) &&  validBST(node.right,node.val,upper);
            
    }
}