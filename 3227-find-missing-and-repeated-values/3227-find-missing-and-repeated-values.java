class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        boolean[] nums = new boolean[(grid.length + 1) * (grid.length + 1)]; 
        int ans [] = new int[2];
        for(int[] row : grid) {
            for(int i : row) {
                if(nums[i]) {
                    ans[0] = i;
                }
                nums[i] = true;
            }
        }
        for(int i = 1; i < nums.length; ++i) {
            if(!nums[i]) {
                ans[1] = i;
                return ans;
            }
        }
        return ans;
    }
}