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
        HashSet<Integer> vals = new HashSet<Integer>();
        if(head == null || head.next == null) {
            return head;
        }
        ListNode temp = head.next;
        ListNode prev = head;
        vals.add(head.val);
        while(temp != null) {
            if(vals.contains(temp.val)) {
                prev.next = temp.next;
            }
            else {
                prev = prev.next;
            }
            vals.add(temp.val);
            temp = temp.next;
        }
        return head;
    }
}