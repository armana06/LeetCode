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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> num = new HashSet<Integer>();
        for(int i : nums) {
            num.add(i);
        }
        while(num.contains(head.val)) {
            head = head.next;
        }
        ListNode temp = head;
        while(temp.next != null) {
            while(temp.next != null && num.contains(temp.next.val)) {
                temp.next = temp.next.next;
            }
            if(temp.next != null) {
                temp = temp.next;
            }
            
        }
        return head;
    }
}