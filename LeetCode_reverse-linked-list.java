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
    public ListNode reverseList(ListNode head) {
        
        //Sbse pehli node ka prev toh null hi hoga
        ListNode prev = null;
        
        //Sbse pehli node khud head hogi
        ListNode curr = head;
        
        while(curr!=null) {
            
            //Save krna pdega bachi hui list ko
            ListNode after = curr.next;
            
            //Ab current ka next  point krega previous ko, tbhi toh reverse hua
            curr.next = prev;
            
            //Ab previous, current ban jaayega
            prev = curr;
            //Aur current k baad wali node, current bn jayegi
            curr = after;
        }
        
        return prev;
    }
}
