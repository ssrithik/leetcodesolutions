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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> arr = new ArrayList<>();
        if(root == null) return arr;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> arr1 = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode ele = queue.poll();
                arr1.add(ele.val);
                if(ele.left != null) queue.offer(ele.left);
                if(ele.right != null) queue.offer(ele.right);
            }
            arr.add(arr1);
        }
        return arr;
    }
   
}