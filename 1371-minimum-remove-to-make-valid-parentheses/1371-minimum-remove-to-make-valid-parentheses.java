class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] str = new char[s.length()];
        StringBuilder ans = new StringBuilder();
        Deque<Integer> paren = new ArrayDeque();
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == ')') {
                if(paren.isEmpty()) {
                    continue;
                }
                paren.pop();
            }
            if(s.charAt(i) == '(') {
               paren.push(i);
            }
            str[i] = s.charAt(i);
        } 
        while(!paren.isEmpty()) {
            str[paren.pop()] = (char) 0;
        }
        for(char c : str) {
            if(c != (char) 0) {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}