class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i = nums.length - 2; i >= 0; --i) {
            if(nums[i] == 0) {
                dp[i] = Integer.MAX_VALUE - 3;
            }
            else if(nums[i] + i >= nums.length - 1) {
                dp[i] = 1;
            }
            else {
                int min = Integer.MAX_VALUE - 3;
                for(int j = i + 1; j <= i + nums[i] && j < nums.length; ++j) {
                    if(dp[j] + 1 < min) {
                        min = dp[j] + 1;
                    }
                }
                dp[i] = min;
         
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[0];
    }
}