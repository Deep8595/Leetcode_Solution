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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newlist = new ListNode(0);
        ListNode newlistTail = newlist;
        int temp = 0;

        while( l1 != null || l2 != null || temp != 0){
            int dil1 = (l1 != null) ? l1.val : 0;
            int dil2 = (l2 != null) ? l2.val : 0;

            int sum = dil1 + dil2 + temp;
            int digit = sum % 10;
            temp = sum / 10;

            ListNode newNode = new ListNode(digit);
            newlistTail.next = newNode;
            newlistTail = newlistTail.next;

            l1 = ( l1 != null ) ? l1.next : null;
            l2 = ( l2 != null ) ? l2.next : null;

        }
        ListNode result = newlist.next;
        newlist.next = null ;
        return result;
    }
}