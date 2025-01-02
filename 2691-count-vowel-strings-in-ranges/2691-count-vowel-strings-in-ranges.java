class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        int[] dp = new int[words.length + 1];
        dp[0] = 0;
        for(int i = 1; i < dp.length; ++i) {
            dp[i] = dp[i - 1] + (isVowel(words[i - 1].charAt(0)) && isVowel(words[i - 1].charAt(words[i -1 ].length() - 1)) ? 1 : 0);
        }
        for(int i = 0; i < queries.length; ++i) {
                ans[i] =  -1 *  dp[queries[i][0]]  + dp[queries[i][1] + 1];   
        }
        return ans;
    }
    public boolean isVowel(char a) {
        return a == 'a' || a == 'i' || a == 'e' || a == 'o' || a == 'u';
    }
}