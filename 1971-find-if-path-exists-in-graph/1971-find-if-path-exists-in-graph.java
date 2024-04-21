class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayDeque<Integer> dfs = new ArrayDeque<Integer>();
        HashSet<Integer> visited = new HashSet<Integer>();
        dfs.push(source);
        if(n == 1) {
            return true;
        }
        while(!dfs.isEmpty()) {
            int elem = dfs.pop();
            for(int[] edge : edges) {
                if(edge[0] == elem && !visited.contains(edge[1])) {
                    if(edge[1] == destination) {
                        return true;
                    }
                    dfs.push(edge[1]);
                    visited.add(edge[1]);
                }
                if(edge[1] == elem && !visited.contains(edge[0])) {
                    if(edge[0] == destination) {
                        return true;
                    }
                    dfs.push(edge[0]);
                    visited.add(edge[0]);
                }
            }
        }
        return false;
    }
}