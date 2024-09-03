class Solution {
    public int getLucky(String s, int k) {
        String ans = "";
        for(int i = 0; i < s.length(); ++i) {
            ans += Integer.toString(s.charAt(i) - 'a' + 1);
        }
        for(int i = 0; i < k; ++i) {
            int tempNum = 0;
            for(int j = 0; j < ans.length(); ++j) {
                tempNum += ((int) (ans.charAt(j) - '0'));
            }
            ans = Integer.toString(tempNum);
        }
        return Integer.valueOf(ans);
    }
}