class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
       ListNode prev=reverse(head);
       ListNode prevtemp=prev;
       int max=prev.val; 
        while(prev.next!=null && prev!=null)
        {
            if(prev.next.val >= max)
            {
                max=prev.next.val;
                prev=prev.next;
                
            }
            else
            {
                prev.next=prev.next.next;
            }
        }
       return reverse(prevtemp);

    }
    public ListNode reverse(ListNode current)
    {
        ListNode prev=null;
        ListNode temp=null;
        while(current!=null)
        {
            temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    } 
}