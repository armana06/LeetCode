class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> occurences = new HashMap();
        for(int i = 0; i < s.length(); i++) {
            if(occurences.putIfAbsent(s.charAt(i), i) != null) {occurences.replace(s.charAt(i), -1);}
        }
        for(int i = 0; i < s.length(); i++) {
            if(occurences.get(s.charAt(i)) != -1) {
                return occurences.get(s.charAt(i));
            }
        }
        return -1;
    }
}