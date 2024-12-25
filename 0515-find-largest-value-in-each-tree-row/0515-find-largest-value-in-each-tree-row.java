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
    List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> largestValues(TreeNode root) {
        large(root, 0);
        return ans;
    }
    public void large(TreeNode root, int i) {
        if(root == null) {
            return ;
        }
        if(ans.size() == i) {
            ans.add(root.val);
        }
        if(root.val > ans.get(i)) {
            ans.set(i, root.val);
        }
        large(root.right, i + 1);
        large(root.left, i + 1);
        
    }
}