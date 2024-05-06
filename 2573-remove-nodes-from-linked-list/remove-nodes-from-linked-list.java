class Solution {
    public ListNode removeNodes(ListNode head) {

        if(head==null || head.next==null)
        {
            return head;
        }
        head=reverse(head);
        int max=head.val;
        ListNode temp=head;
        ListNode temp1=head;
        while(head!=null)
        {
            temp=head.next;
            while((temp!=null)&&temp.val<max)
            {
                temp=temp.next;
            }
            if(temp!=null)
            {
                max=temp.val;
            }
            head.next=temp;
            
            head=head.next;
        }
        return reverse(temp1);

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