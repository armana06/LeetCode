class Solution {
    public int subsetXORSum(int[] nums) {
        return XORSum(nums, 0, 0);
    }
    public int XORSum(int[] nums, int ans, int index) {
        if(index < nums.length) {
            return XORSum(nums, ans ^ nums[index], index + 1) + XORSum(nums, ans, index + 1);
        }
        return ans;
    }
}