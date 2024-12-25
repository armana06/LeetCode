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
    HashMap<Integer, Integer> greatMap = new HashMap<Integer, Integer>();        
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        int max = large(root, 0);
        for(int i = 0; i < max; ++i) {
            ans.add(i, greatMap.get(i));
        }
        return ans;
    }
    public int large(TreeNode root, int i) {
        if(root == null) {
            return i;
        }
        if(!greatMap.containsKey(i) || root.val > greatMap.get(i)) {
            greatMap.put(i, root.val);
        }
       return Math.max(large(root.left, i + 1), large(root.right, i + 1));
        
    }
}