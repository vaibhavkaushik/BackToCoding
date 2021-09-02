class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;        
        ListNode ans;

        if(l1.val <= l2.val){
            ans = l1;
            l1 = l1.next;
        } else {
            ans = l2;
            l2 = l2.next;
        }

        ListNode headAns = ans;
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                ans.next = l1;
                l1 = l1.next;
            } else {
                ans.next = l2;
                l2 = l2.next;
            }
            ans = ans.next;
        }
        
        if (l1 == null) ans.next = l2;
        else ans.next = l1;

        return headAns;
    }
}
