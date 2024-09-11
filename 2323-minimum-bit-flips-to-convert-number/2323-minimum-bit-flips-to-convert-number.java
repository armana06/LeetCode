class Solution {
    public int minBitFlips(int start, int goal) {
        int flips = 0;
        while(start > 0 || goal > 0) {
            flips = start % 2 == goal % 2 ? flips : flips + 1;
            start /= 2;
            goal /= 2;
        }
        return flips;
    }
}