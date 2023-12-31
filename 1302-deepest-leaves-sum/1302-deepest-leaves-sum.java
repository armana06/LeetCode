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
    public int deepestLeavesSum(TreeNode root) {
        LinkedList<TreeNode> bfs = new LinkedList();
        bfs.addLast(root);
        return dLS(bfs, root.val);

    }
    int dLS(LinkedList<TreeNode> bfs, int sum) {
        boolean isDeep = true;
        LinkedList<TreeNode> newList = new LinkedList();
        int sumNew = 0;
        for(TreeNode t : bfs) {
            if(t.right != null && t.left != null) {
                isDeep = false;
                newList.addLast(t.right);   
                newList.addLast(t.left);
                sumNew += t.right.val + t.left.val;
            }
            else if(t.right != null) {
                isDeep = false;
                newList.addLast(t.right);
                sumNew += t.right.val;
            }
            else if(t.left != null) {
                isDeep = false;
                newList.addLast(t.left);
                sumNew += t.left.val;
            }
        }
        if(isDeep) {
            return sum;
        }
        return dLS(newList, sumNew);
    }
}