class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        Integer[] dp = new Integer[words.length + 1];
        dp[0] = isVowel(words[0].charAt(0)) && isVowel(words[0].charAt(words[0].length() - 1)) ? 1 : 0;
        for(int i = 0; i < queries.length; ++i) {
            ans[i] =  -1 *  fillDp(queries[i][0] - 1, dp, words)  + fillDp(queries[i][1], dp, words);   
        }
        return ans;
    }
    public boolean isVowel(char a) {
        return a == 'a' || a == 'i' || a == 'e' || a == 'o' || a == 'u';
    }
    public int fillDp(int i, Integer[] dp, String[] words) {
        if(i == -1) {
            return 0;
        }
        if(dp[i] == null) {
            dp[i] = fillDp(i - 1, dp, words) + (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1)) ? 1 : 0);
        }
        return dp[i];
    }
}