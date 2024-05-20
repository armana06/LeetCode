class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) {
            return true;
        }
        boolean[] dp = new boolean[nums.length - 1];
        dp[dp.length - 1] = nums[dp.length - 1] != 0;
        for(int i = dp.length - 1; i >= 0; --i) {
            dp[i] = i + nums[i] >= nums.length - 1;
            for(int j = nums[i]; j > 0; --j) {
                if(dp[i]) {
                    break;
                }
                dp[i] = dp[i] || dp[i + j];
            }
        }
        return dp[0];
    }
}