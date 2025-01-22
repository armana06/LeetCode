class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i/2 < word1.length() && Math.floor(i/2.0) < word2.length()) {
            if(i%2 == 0) {
                ans.append(word1.charAt(i/2));
            }
            else {
                ans.append(word2.charAt(((int) Math.floor(i/2.0))));
            }
            ++i;
        } 
        if(Math.ceil(i/2.0) < word1.length()) {
            ans.append(word1.substring(i/2));
        }
        if(Math.floor(i/2.0) < word2.length()) {
            ans.append(word2.substring(((int) Math.floor(i/2))));
        }
        return ans.toString();
    }
}