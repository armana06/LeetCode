class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int curSum = 0;
        int curNum = 0;
        boolean[] b = new boolean[n + 1];
        for(int ban : banned) {
            if(ban > n) {
                continue;
            }
            b[ban] = true;
        }
        for(int i = 1; i <= n; ++i) {
            if(!b[i]) {
               curSum += i; 
                if(curSum > maxSum) {
                    return curNum;
                }
                else {
                    curNum++;
                }
            }
        }
        return curNum;
    }
}