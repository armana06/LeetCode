class Solution {
    public int findMaxK(int[] nums) {
        int[] visited = new int[1001];
        int max = -1;
        for(int i = 0; i < nums.length; ++i) {
            if(visited[Math.abs(nums[i])] * nums[i] < 0 && max < Math.abs(nums[i])) {
                max = Math.abs(nums[i]);
            }
            visited[Math.abs(nums[i])] = nums[i]/Math.abs(nums[i]);
        }
        return max;
    }
}