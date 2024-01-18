class Solution {
    public String longestPalindrome(String s) {
        int max = 1;
        int maxi = 0;
        int maxj = 1;
        boolean[][] dp = new boolean[s.length() + 1][s.length() + 1];
        for(int i = 0; i < dp.length; i++) {
            dp[i][i] = true;
            for(int j = dp[i].length - 1; j >= i + max; j--) {
                if(isPalindrome(s.substring(i, j))) {
                    dp[i][j] = true;
                    if(j - i > max) {
                        max = j - i;
                        maxi = i;
                        maxj = j;
                    }
                    break;
                }
            }
        }
        return s.substring(maxi, maxj);
    }
    boolean isPalindrome(String s) {
        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;    
    }
}