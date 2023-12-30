class Solution {
    public String longestCommonPrefix(String[] strs) {
        int j = 0;
        String str = "";
        for(int i = 0; i <= strs[0].length() - 1; i++) {
            for(j = 0; j <= strs.length - 1; j++) {
                if(i >= strs[j].length() || !(strs[0].charAt(i) == strs[j].charAt(i))) {
                    return str;
                }
            }
            str += strs[j  - 1].charAt(i);
        }
        return str;
    }
}
