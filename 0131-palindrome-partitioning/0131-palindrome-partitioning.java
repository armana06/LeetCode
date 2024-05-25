class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        generatePartition(s, 0, 0, cur, ans);
        return ans;
    }
    void generatePartition(String s, int index, int lastPartition, List<String> cur, List<List<String>> ans) {
        String curString = s.substring(lastPartition, index + 1);
        boolean stringPalindrome = isPalindrome(curString);
        if(index == s.length() - 1 && stringPalindrome) {
            cur.add(curString);
            ans.add(cur);
            return;
        }
        else if(index == s.length() - 1) {
            return;
        }
        else {
            generatePartition(s, index + 1, lastPartition, new ArrayList<String>(cur), ans);
            if(stringPalindrome) {
                List<String> curCopy = new ArrayList<String>(cur);
                curCopy.add(curString);
                generatePartition(s, index + 1, index + 1, curCopy, ans);
            }
        }

    }
    boolean isPalindrome(String s) {
        for(int i = 0; i < s.length()/2; ++i) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}