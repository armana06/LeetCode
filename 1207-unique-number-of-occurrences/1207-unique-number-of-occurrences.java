class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurences = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; ++i) {
            if(occurences.containsKey(arr[i])) {
                occurences.replace(arr[i], occurences.get(arr[i]) + 1);
            }
            else {
                occurences.put(arr[i], 1);
            }
        }
        return new HashSet<Integer>(occurences.values()).size() == occurences.size();
    }
}