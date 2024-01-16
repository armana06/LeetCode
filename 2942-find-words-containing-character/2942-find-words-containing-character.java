class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < words.length; i++) {
            if(words[i].contains(((Character) x).toString())) {
                ans.addLast(i);
            }
        }
        return ans;
    }
}