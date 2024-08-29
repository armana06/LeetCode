class Solution {
    int ccCount = 0;
    public int removeStones(int[][] stones) {
        int[] unionFind = new int[200003];
        for(int i = 0; i < stones.length; ++i) {
            mergeComponents(stones[i][0] + 1, stones[i][1] + 10003, unionFind);
        }
        return stones.length - ccCount;
        
    }
    public int findRep(int pos, int[] unionFind) {
        if(unionFind[pos] == 0) {
            unionFind[pos] = pos;
            ccCount++;
        }
        if(unionFind[pos] != pos) {
            unionFind[pos] = findRep(unionFind[pos], unionFind);
        }
        return unionFind[pos];
    }
    public void mergeComponents(int x, int y, int[] unionFind) {
        int xRep = findRep(x, unionFind);
        int yRep = findRep(y, unionFind);
        if(xRep != yRep) {
            unionFind[yRep] = xRep;
            ccCount--;
        }
    }
}