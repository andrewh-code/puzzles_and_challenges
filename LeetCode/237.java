/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        
        node.val = node.next.val;
        node.next = node.next.next;
        /*while ((node.next != null) || (node == null))
        {
            if (node.val = x)
            {
                   
            }
            node.val = node.next.val;
            node.next = node.next.next;
        }
        */
    }
}