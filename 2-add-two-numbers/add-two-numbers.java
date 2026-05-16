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
    public ListNode addTwoNumbers(ListNode temp1, ListNode temp2) {
        ListNode ans=new ListNode(0);
        ListNode anss=ans;
        int carry=0;
        int n1;
        int n2;
        while(temp1!=null || temp2!=null)
        {
             n1=temp1 == null ? 0 : temp1.val;
             n2=temp2 == null ? 0 : temp2.val;
            ans.next=new ListNode((n1+n2+carry)%10);
            carry=(n1+n2+carry)/10;
            ans=ans.next;
            temp1=temp1 == null ? null :temp1.next;
            temp2=temp2 == null ? null : temp2.next;
        }
        if(carry > 0)
        {
            ans.next=new ListNode(carry);
        }
        return anss.next;
    }
}