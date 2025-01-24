class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<Integer>();
        Boolean[] dp = new Boolean[graph.length];
        HashSet<Integer> visited = new HashSet<Integer>();
        for(int i = 0; i < graph.length; ++i) {
            if(dfs(graph, i, dp, visited)) {
                ans.add(i);
            }
        }
        return ans;
    }
    public Boolean dfs(int[][] graph, int i, Boolean[] dp, HashSet<Integer> visited) {
        if(dp[i] != null) {
            return dp[i];
        }
        if(visited.contains(i)) {
            dp[i] = false;
            return dp[i];
        }
        visited.add(i);
        boolean temp = true;
        for(int j = 0; j < graph[i].length; ++j) {
            if(i == graph[i][j]) {
                temp = false;
                break;
            }
            temp = temp && dfs(graph, graph[i][j], dp, visited);
        }
        dp[i] = temp;
        return dp[i];
    }
}