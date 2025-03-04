/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
       List<Integer> m = new ArrayList<>();
       while(head!=null)
       {
        m.add(head.val);
        head = head.next;
       }
       int i=0;
       int j = m.size()-1;
      
        while(i<j && m.get(i)==m.get(j))
        {
            i++;
            j--;
        }
    
        
       
       return i>=j;
    }
}