class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        ArrayList<String> sList = new ArrayList<String>(Arrays.asList(s.split("")));
        for(int i = 0; i < t.length(); i++) {
            if(!sList.contains(t.substring(i, i + 1))) {
                return false;
            }
            sList.remove(t.substring(i, i + 1));
        }
        return true;
    }
}