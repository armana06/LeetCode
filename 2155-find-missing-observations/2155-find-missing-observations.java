class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sumMissing = 0;
        for(int roll : rolls) {
            sumMissing += roll;
        }
        sumMissing = (mean * (rolls.length + n)) - sumMissing;
        int avgMissing = ((int) Math.floor(((float) sumMissing) / n));
        int remainder = sumMissing - (avgMissing * n);
        if(sumMissing <= 0 || avgMissing > 6 || (avgMissing == 6 && remainder > 0) || (avgMissing == 0)) {
            return new int[]{};
        }
        int[] ans = new int[n];
        for(int i = 0; i < n; ++i) {
            ans[i] = avgMissing;
            if(ans[i] != 6 && remainder > 0) {
                ans[i]++;
                remainder--;
            }
        }
        return ans;

    }
}