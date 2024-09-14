class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long curSum = 0;
        HashSet<Integer> curElem = new HashSet<Integer>();
        int i = 0;
        int j = 0;
        while(j < nums.length) {
            while(!curElem.add(nums[j]) || curElem.size() > k) {
                curElem.remove(nums[i]);
                curSum -= nums[i];
                i++;
                if(i >= nums.length) {
                    return maxSum;
                }
                if(curElem.size() == k) {
                    break;
                }
            }
            curSum += nums[j];
            if(curElem.size() == k) {
                maxSum = maxSum > curSum ? maxSum : curSum;
            }
            j++;
        }

        return maxSum;     
    }
}