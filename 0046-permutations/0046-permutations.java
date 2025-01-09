class Solution {
    List<List<Integer>> ans = new ArrayList();
    public List<List<Integer>> permute(int[] nums) {

       perm(nums, new HashSet<Integer>(), new ArrayList<Integer>()); 
       return ans;
    }
    public void perm(int[] nums, HashSet<Integer> missing, ArrayList<Integer> cur) {
        if (cur.size() == nums.length) {
            ans.add(new ArrayList<Integer>(cur));
        } 
        for(int i : nums) {
            if(!missing.contains(i)) {
                missing.add(i);
                cur.add(i);
                perm(nums, missing, cur);
                missing.remove(i);
                cur.removeLast();
            }
        }
    }
}