class Solution {
    List<List<Integer>> ans;
    public void combo(int n, int k, int cur, List<Integer> template) {
        if(template.size() == k) {
            ans.add(template);
            return;
        }
        for(int i = template.size() == 0 ? 1 : (template.getLast() + 1); i <= n - (k - cur) + 1; ++i) {
            List<Integer> temp = new ArrayList<Integer>(template);
            temp.add(i);
            combo(n, k, cur + 1, temp);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList();
        combo(n, k, 0, new ArrayList<Integer>());
        return ans;
    }
}