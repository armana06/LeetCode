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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> trav = new ArrayList<Integer>();
        inoTrav(root, trav);
        return trav;
    }
    void inoTrav(TreeNode root, List<Integer> a) {
        if(root == null) {
            return;
        }
        inoTrav(root.left, a);
        a.add(root.val);
        inoTrav(root.right, a);
    }
}