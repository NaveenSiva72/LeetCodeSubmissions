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
        ListNode fi = head;
        ListNode cut = head;
        if(head==null || head.next==null){
            return head;
        }
        while(head.next!=null){
            if(head.next.val == head.val){
                head = head.next;
            }else{
                cut.next = head.next;
                head = head.next;
                cut = head;
            }

        }
        if(head.next==null){
            cut.next=null;
        }
        return fi;
        
    }
}