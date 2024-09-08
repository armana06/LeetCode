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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ListNode headOriginal;
    public boolean isSubPath(ListNode head, TreeNode root) {
        return subPath(head, head, root);
    }
    public boolean subPath(ListNode head, ListNode i, TreeNode root) {
        if(i == null) {
            return true;
        }
        if(root == null) {
            return false;
        }
        if(i.val == root.val) {
            i = i.next;
        }
        else if(head.val == root.val) {
            head = head.next;
        }
        else {
            i = head;
        }
        return subPath(head, i, root.left) || subPath(head, i, root.right);
    } 
}