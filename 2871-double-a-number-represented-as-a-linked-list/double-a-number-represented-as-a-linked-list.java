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
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        ListNode temp=head;
        int curr=0;
        int remainder= 0;
        while(head != null)
        {
            curr = (head.val * 2) + remainder;
            head.val = curr%10;
            remainder=curr/10;
            head=head.next;
            
        }
        head=reverse(temp);
        if(remainder!=0)
        {
            temp= new ListNode(remainder);
            temp.next=head;
            return temp;
        }

        return head;


    }
    public  ListNode reverse(ListNode curr)
    {
        ListNode temp=null;
        ListNode prev=null;
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        return prev;
    }
}