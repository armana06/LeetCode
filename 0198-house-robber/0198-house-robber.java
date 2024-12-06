class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];        
        Arrays.fill(dp, -1);
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        return robrec(nums, nums.length - 1, dp);
    }
    int robrec(int[] nums, int i, int[] dp) {
        if(dp[i] == -1) {
            dp[i] = Math.max(robrec(nums, i - 2, dp) + nums[i], robrec(nums, i - 1, dp));
        }
        return dp[i];
    }
}