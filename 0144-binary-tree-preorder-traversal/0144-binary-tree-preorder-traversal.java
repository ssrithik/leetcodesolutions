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
    public List<Integer> preorderTraversal(TreeNode root) {
     List<Integer> s = new ArrayList<>();
        
        display(root,s);
        return s;
    }
    void display(TreeNode root,List<Integer> s )
    {
        
        TreeNode temp = root;
        if(temp == null)
        return;
         s.add(temp.val);
        display(temp.left,s);
       
        display(temp.right,s);

        
    }
}