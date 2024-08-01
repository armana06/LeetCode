class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        if(s.charAt(0) == '0') {
            return 0;
        }
        dp[0] = 1;
        for(int i = 1; i < s.length(); ++i) {
            if(s.charAt(i) != '0') {
                dp[i] += dp[i - 1];
            }
            System.out.println(s.charAt(i - 1));
            if(s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6')) {
                if(i < 2) {
                    dp[i] += 1;
                }
                else {
                    dp[i] += dp[i - 2];
                }
            }
        }
        return dp[s.length() - 1];
    }
}