class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        List<List<Integer>> matrix = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(frequencies.containsKey(nums[i])) {
                frequencies.replace(nums[i], frequencies.get(nums[i]) + 1);
            }
            else {
                frequencies.put(nums[i], 1);
            }
        }
        Set<Integer> numsUnique = frequencies.keySet();
        for(Integer f : numsUnique) {
            for(int i = 0; i < frequencies.get(f); i++) {
                if(i >= matrix.size()) {
                    matrix.add(new ArrayList<Integer>());
                }
                matrix.get(i).add(f);
            }
        }
        return matrix;
    }
}