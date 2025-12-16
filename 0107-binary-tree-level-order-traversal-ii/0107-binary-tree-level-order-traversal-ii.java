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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       
        List<List<Integer>> arr = new ArrayList<>();
        if(root == null)
        return arr;
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);
        while(!queue.isEmpty())
        {
            ArrayList<Integer> arr1 = new ArrayList<>();
            int size = queue.size();
            
            for(int i=0;i<size;i++)
            {
                  TreeNode node = queue.poll();
                  arr1.add(node.val);
                  if(node.left != null) 
                  queue.offer(node.left);
                  if(node.right != null)
                  queue.offer(node.right);
            }
            arr.add(arr1);
        }
        Collections.reverse(arr);
        return arr;
    }
}