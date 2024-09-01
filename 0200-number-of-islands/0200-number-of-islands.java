class Solution {
    int numOfIslands = 0;
    int gridLength = 0;
    public int findRep(int i, int[] islands) {
        if(islands[i] != i) {
            islands[i] = findRep(islands[i], islands);
        }
        return islands[i];
    }
    public void merge(int i, int j, int[] islands) {
        int iRep = findRep(i, islands);
        int jRep = findRep(j, islands);
        if(iRep != jRep) {
            islands[iRep] = jRep;
            numOfIslands--;
        }
    }
    public int numIslands(char[][] grid) {
        gridLength = grid[0].length;
        int[] islands = new int[grid.length * grid[0].length];
        Arrays.fill(islands, -1);
        for(int i = 0; i < grid.length; ++i) {
            for(int j = 0; j < grid[i].length; ++j) {
                if(grid[i][j] == '1') {
                    numOfIslands++;
                    islands[i * gridLength + j] = i * gridLength + j;
                    int[][] adj = new int[][] {{i - 1, j}, {i, j - 1}};
                    for(int[] coord : adj) {
                        if(coord[0] >= 0 && coord[1] >= 0 && coord[0] < grid.length && coord[1] < grid[i].length && grid[coord[0]][coord[1]] == '1') {
                            merge(i * gridLength + j, coord[0] * gridLength + coord[1], islands);
                        }
                    }
                }
            }
        }
        return numOfIslands;
    }
}