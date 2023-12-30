class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        pascal.add(new ArrayList<Integer>());
        pascal.get(0).add(1);
        for(int i = 1; i < numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(1);
            for(int j = 0; j < pascal.get(i - 1).size() - 1; j++) {
                temp.add(pascal.get(i - 1).get(j) + pascal.get(i - 1).get(j + 1));
            }
            temp.add(1);
            pascal.add(temp);
        }
        return pascal;
    }
}