/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<ListNode>();
        ListNode temp = head;
        while(temp != null && !nodes.contains(temp)) {
            nodes.add(temp);
            temp = temp.next;
        }
        return temp;
    }
}