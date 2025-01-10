class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] chars = new int[26];
        List<String> ans = new ArrayList<String>();
        for(String s : words2) {
            int[] temp = new int[26];
            for(int i = 0; i < s.length(); ++i) {
                if(++temp[(((int) s.charAt(i)) - 'a')] > chars[(((int) s.charAt(i)) - 'a')]) {
                    chars[(((int) s.charAt(i)) - 'a')] = temp[(((int) s.charAt(i)) - 'a')];
                }
            }
        }
        for(String s : words1) {
            boolean isUniversal = true;
            int[] temp = new int[26];
            for(int i = 0; i < s.length(); ++i) {
                ++temp[(((int) s.charAt(i)) - 'a')];   
            }
            for(int i = 0; i < temp.length; ++i) {
                if(temp[i] < chars[i]) {
                    isUniversal = false;
                    break;
                }
            }
            if(isUniversal) {
               ans.add(s); 
            }
        }
        return ans;
    }
}