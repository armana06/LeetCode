class Solution {
    public int lengthOfLongestSubstring(String s){
        int lengthofsubstring = 0;
        ArrayList <Character> letters = new ArrayList();
        for(int i = 0; i <= s.length() - 1; i++) {
            lengthofsubstring = Math.max(lengthofsubstring, letters.size());
            while(letters.contains(s.charAt(i))) {
                letters.remove(0);
            }
            letters.add(s.charAt(i));   
            }
        return Math.max(lengthofsubstring, letters.size());
    }
}
