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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        for(int[] arr : ans) {
            Arrays.fill(arr, -1);
        }
        int filled = 0;
        int i = 0;
        int j = 0;
        ListNode temp = head;
        int barrier = 0;
        while(temp != null) {
            for(; j < n - barrier; ++j) {
                if(temp == null) {
                    break;
                }
                ans[i][j] = temp.val;
                temp = temp.next;
            }
            j--;
            i++;
            for(; i < m - barrier; ++i) {
                if(temp == null) {
                    break;
                }
                ans[i][j] = temp.val;
                temp = temp.next;
            }
            j--;
            i--;
            for(;j >= 0 + barrier; --j) {
                if(temp == null) {
                    break;
                }
                ans[i][j] = temp.val;
                temp = temp.next;
            }
            j++;
            i--;
            barrier++;
            for(;i >= 0 + barrier; --i) {
                if(temp == null) {
                    break;
                }
                ans[i][j] = temp.val;
                temp = temp.next;
            }
            i++;
            j++;
        }
        return ans;
    }
}