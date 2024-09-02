/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> nodes = new HashSet<ListNode>();
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != null || tempB != null) {
            if(tempA != null) {
                if(!nodes.add(tempA)) {
                    return tempA;
                }
                tempA = tempA.next;
            }
            if(tempB != null) {
                if(!nodes.add(tempB)) {
                    return tempB;
                }
                tempB = tempB.next;
            }
        }
        return null;
    }
}