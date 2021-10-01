/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        //Copy the value of next node to curr node
        node.val=node.next.val;
        //Point the current node next to next of next node
        node.next=node.next.next;
    }
}
