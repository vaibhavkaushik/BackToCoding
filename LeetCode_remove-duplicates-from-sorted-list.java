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
    public ListNode deleteDuplicates(ListNode head) {
        //The basic condition to prevent null pointer errors
        if(head == null || head.next == null) return head;
        
        //Let's start from the first node
        ListNode temp = head;
        //While the current node is not null or the next of current node is not null
        while(temp!=null && temp.next!=null) {
            
            //If the current and next node value matches then we need to jump ahead the pointer and 
            //skip the next node. Else we move normally one by one 
            if(temp.val == temp.next.val) {
                    temp.next = temp.next.next;    
            } else {
                temp = temp.next;
            }
        }
        
        return head;
    }
}
