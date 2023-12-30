class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> function = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            function.put(target - nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            if(function.getOrDefault(nums[i], null) != null && function.getOrDefault(nums[i], null) != i) {
                int[] ans = {i, function.getOrDefault(nums[i], null)};
                return ans;
            }
        }
        return null;
    }
}