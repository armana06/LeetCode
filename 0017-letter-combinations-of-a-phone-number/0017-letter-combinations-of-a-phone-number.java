class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            return ((List<String>) new ArrayList());
        }
        HashMap<String, String[]> dict = new HashMap<>();
        for(int i = 2; i < 10; i++) {
            if(i == 7) {
                dict.put("7", new String[] {"p", "q", "r", "s"});
                continue;
            }
            if(i == 8) {
                dict.put("8", new String[] {"t", "u", "v"});
                continue;
            }
            if(i == 9) {
                dict.put("9", new String[] {"w", "x", "y", "z"});
                continue;
            }
            dict.put(((Integer) i).toString(), new String[] {Character.toString('a' + (3 * (i - 2))), Character.toString('b' + (3 * (i - 2))), Character.toString('c' + (3 * (i - 2)))});
        }
        List<String> ans = new ArrayList<String>();
        computeCombo(dict, ans, digits, "");
        return ans;
    }
    void computeCombo(HashMap<String, String[]> dict, List<String> ans, String digits, String sol) {
        if(digits.length() == 0) {
            ans.add(sol);
            return;
        }
        for(String let : dict.get(digits.substring(0, 1))) {
            computeCombo(dict, ans, digits.substring(1), sol + let);
        }
    }
}