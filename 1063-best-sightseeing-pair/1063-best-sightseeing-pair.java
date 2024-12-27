class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int lastScore = 0;
        int maxScore = 0; 
        for(int i = 1; i < values.length; ++i) {
            lastScore = Math.max(lastScore - 1 - values[i - 1] + values[i], values[i] + values[i - 1] - 1);
            maxScore = Math.max(maxScore, lastScore);
        } 
        return maxScore;
    }
}