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
        HashSet[] nodeTable = new HashSet[2 * ((int) Math.pow(10, 5)) + 1];
        ListNode temp = head;
        while(temp != null) {
            if(nodeTable[temp.val + ((int) Math.pow(10, 5))] == null) {
                nodeTable[temp.val + ((int) Math.pow(10, 5))] = new HashSet<ListNode>();
            }
            if(nodeTable[temp.val + ((int) Math.pow(10, 5))].add(temp) == false) {
                return temp;
            }
            temp = temp.next;
        }
        return temp;
    }
}