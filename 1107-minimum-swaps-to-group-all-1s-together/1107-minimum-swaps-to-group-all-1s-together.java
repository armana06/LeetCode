class Solution {
    public int minSwaps(int[] data) {
        int winSize = 0;
        for(int i = 0; i < data.length; ++i) {
            if(data[i] == 1) {
                winSize++;
            }
        }
        int maxOnes = 0;
        int curOnes = 0;
        for(int i = 0; i < winSize; ++i) {
            if(data[i] == 1) {
                maxOnes++;
                curOnes++;
            }
        }
        for(int i = 1, j = winSize; j < data.length; ++i, ++j) {
            if(data[i - 1] == 1) {
                curOnes--;
            }
            if(data[j] == 1) {
                curOnes++;
            }
            if(curOnes > maxOnes) {
                maxOnes = curOnes;
            }
        }
        return winSize - maxOnes;
    }
}