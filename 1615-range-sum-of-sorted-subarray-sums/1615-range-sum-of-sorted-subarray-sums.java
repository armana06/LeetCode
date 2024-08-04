class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Long> sortedSum = new ArrayList<Long>();
        long[][] sums = new long[nums.length][nums.length];
        int ans = 0;
        int sum = 0;
        sums[0][0] = (long) nums[0];
        sortedSum.add((long) nums[0]);
        for(int i = 0; i < nums.length; ++i) {
            for(int j = i; j < nums.length; ++j) {
                if(i == 0 && j == 0) {
                    continue;
                }
                if(j == i) {
                    sums[i][j] = (long) nums[i];
                    sortedSum.add(sums[i][j]);
                    continue;
                }
                sums[i][j] = sums[i][j - 1] + nums[j];
                sortedSum.add(sums[i][j]);
            }
        }
        Collections.sort(sortedSum);
        for(int i = left - 1; i < right; ++i) {
            sum = (int) (sum + ((sortedSum.get(i) % ((int) (Math.pow(10, 9) + 7))))) % ((int) (Math.pow(10, 9) + 7)) ;
        }
        return sum;
    }
}