class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> vals = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; ++i) {
            if(vals.containsKey(target - nums[i])) {
                return new int[] {i, vals.get(target - nums[i])};
            }
            vals.put(nums[i], i);
        }
        return null;
    }
}