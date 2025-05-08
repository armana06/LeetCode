class Solution {
    public String countAndSay(int n) {
        if(n == 1) {
            return "1";
        } 
        String s = countAndSay(n - 1);
        System.out.println(s);
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); ++i) {
            int j = 1;
            while(i + j < s.length() && s.charAt(i) == s.charAt(i + j)) {
                ++j;
            }
            ans.append(j);
            ans.append(s.charAt(i));
            i = i + j - 1;
        }
        return ans.toString();
    }
}