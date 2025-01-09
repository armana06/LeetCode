class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        for(String s : words) {
            if(pref.length() <= s.length() && s.substring(0, pref.length()).equals(pref)) {
                ans++;
            }
        } 
        return ans;
    }
}