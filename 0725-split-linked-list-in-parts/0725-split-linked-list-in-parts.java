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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        int length = 0;
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        int intervals = ((int) Math.floor(length/k)) > 0 ? ((int) Math.floor(length/k)) : 1 ;
        int remainder = length - (intervals * k);
        ListNode[] ans = new ListNode[k];
        temp = head;
        for(int i = 0; i < k; ++i) {
            if(temp == null) {
                break;
            }
            ListNode prev = temp;
            for(int j = 0; j < intervals; ++j) {
                if(j == 0) {
                    ans[i] = temp;
                    temp = temp.next;
                }
                else {
                    temp = temp.next;
                    prev = prev.next;
                }
            }
            if(remainder > 0) {
                remainder--;
                temp = temp.next;
                prev = prev.next;
            }
            prev.next = null;
        }
        return ans;
    }
}