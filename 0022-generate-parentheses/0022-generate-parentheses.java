class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> ans = new ArrayList<String>(); 
       gen(n, new StringBuilder(), ans, 0);
       return ans;
    }
    public void gen(int n, StringBuilder s, List<String> ans, int count) {
        if(n == 0 && count == 1) {
           s.append(')'); 
           ans.add(s.toString());
            s.delete(s.length() - 1, s.length());
        }
        else if(count == 0) {
            if(n <= 0) {
                return;
            }
            gen(n - 1, s.append('('), ans, count + 1);
            s.delete(s.length() - 1, s.length());
        }
        else {
            if(n > 0) {
                gen(n - 1, s.append('('), ans, count + 1);
                s.delete(s.length() - 1, s.length());
            }
            gen(n, s.append(')'), ans, count - 1);
            s.delete(s.length() - 1, s.length());
        }
    }
}