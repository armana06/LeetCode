class Solution {
    List<List<Integer>> ans;
    public void combo(int n, int k, int cur, List<Integer> template) {
        if(template.size() == k) {
            ans.add(new ArrayList<Integer>(template));
            return;
        }
        for(int i = template.size() == 0 ? 1 : (template.getLast() + 1); i <= n - (k - cur) + 1; ++i) {
            template.add(i);
            combo(n, k, cur + 1, template);
            template.removeLast();
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList();
        combo(n, k, 0, new ArrayList<Integer>());
        return ans;
    }
}