class Solution {
    public String smallestString(String s) {
        StringBuilder ans = new StringBuilder();
        boolean transformed = false;
        int i = 0;
        while(i < s.length() && s.charAt(i) == 'a') {
            ans.append(((char) s.charAt(i)));
            i++;
        }
        while(i < s.length() && s.charAt(i) != 'a') {
            transformed = true;
            ans.append(((char) (s.charAt(i) - 1)));
            i++;
        }
        if(!transformed) {
            ans.delete(s.length() - 1, s.length());
            ans.append('z');
        }
        else {
            ans.append(s.substring(i));
        }
        return ans.toString();
    }
}