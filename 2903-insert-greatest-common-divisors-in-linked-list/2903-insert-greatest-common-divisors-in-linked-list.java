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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) {
            return head;
        } 
        ListNode prev = head;
        ListNode temp = head.next;
        while(temp != null) {
            prev.next = new ListNode(euclid(Math.max(prev.val, temp.val), Math.min(prev.val, temp.val)));
            prev.next.next = temp;
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public int euclid(int a, int b) {
        if(Math.floor(a/b) * b == a) {
            return b;
        }
        return euclid(b, ((int) (a - Math.floor(a/b) * b)));
    }
}