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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leaf1 = new ArrayList<Integer>();
        ArrayList<Integer> leaf2 = new ArrayList<Integer>();
        Stack<TreeNode> dfs1 = new Stack<TreeNode>();
        dfs1.push(root1);
        Stack<TreeNode> dfs2 = new Stack<TreeNode>();
        dfs2.push(root2);
        while(!dfs1.isEmpty() || !dfs2.isEmpty()) {
            if(!dfs1.isEmpty()) {
                TreeNode temp = dfs1.pop();
                if(temp.right == null && temp.left == null) {
                    leaf1.add(temp.val);
                    if(leaf2.size() >= leaf1.size() && leaf1.getLast() != leaf2.get(leaf1.size() - 1)) {
                        return false;
                    }
                }
                if(temp.right != null) {
                    dfs1.push(temp.right);
                }
                if(temp.left != null) {
                    dfs1.push(temp.left);
                }
            }
            if(!dfs2.isEmpty()) {
                TreeNode temp = dfs2.pop();
                if(temp.right == null && temp.left == null) {
                    leaf2.add(temp.val);
                    if(leaf1.size() >= leaf2.size() && leaf2.getLast() != leaf1.get(leaf2.size() - 1)) {
                        return false;
                    }
                }
                if(temp.right != null) {
                    dfs2.push(temp.right);
                }
                if(temp.left != null) {
                    dfs2.push(temp.left);
                }
            }
        }
        return leaf1.size() == leaf2.size();
    }
}