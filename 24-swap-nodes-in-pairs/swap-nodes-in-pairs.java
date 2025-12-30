class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode ans=head;
        int curr;
        if(head == null || head.next == null)
        {
            return head;
        }
        while(head != null && head.next!=null)
        {
             curr=head.val;
            ListNode pre=head;
            head=head.next;
            pre.val=head.val;
            head.val=curr;
            head=head.next;
        }
        return ans;
    }
}