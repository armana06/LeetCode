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
    public TreeNode ans = null;
    public TreeNode leftReplace(TreeNode parent, TreeNode root, boolean direction) {
        if(parent == null) {
            return root.right != null ? root.right : null;
        }
        if(direction) {
            parent.right = root.right != null ? root.right : null;
            return parent.right;
        }
        else {
            parent.left = root.right != null ? root.right : null;
            return parent.left;
        }
    }
    public TreeNode rightReplace(TreeNode parent, TreeNode root, boolean direction) {
        if(parent == null) {
            return root.left != null ? root.left : null;
        }
        if(direction) {
            parent.right = root.left != null ? root.left : null;
            return parent.right;
        }
        else {
            parent.left = root.left != null ? root.left : null;
            return parent.left;
        }
    }
    public void trim(TreeNode parent, TreeNode root, int low, int high) {
        if(root != null) {
            TreeNode newRoot = root;
            while(newRoot != null && (newRoot.val < low || newRoot.val > high)) {
                while(newRoot != null && newRoot.val < low) {
                    newRoot = leftReplace(parent, newRoot, (parent != null && newRoot == parent.left ? false : true));
                    if(parent == null) {
                        ans = newRoot;
                        trim(null, newRoot, low, high);
                    }
                }
                while(newRoot != null && newRoot.val > high) {
                    newRoot = rightReplace(parent, newRoot, (parent != null && newRoot == parent.left ? false : true));
                    if(parent == null) {
                        ans = newRoot;
                        trim(null, newRoot, low, high);
                    }
                }
            }
            if(newRoot == null) {
                return;
            }
            if(newRoot.left != null) {
                trim(newRoot, newRoot.left, low, high);
            }
            if(newRoot.right != null) {
                trim(newRoot, newRoot.right, low, high);
            }
        }
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
        ans = root;
        trim(null, root, low, high);
        return ans;
    }
}