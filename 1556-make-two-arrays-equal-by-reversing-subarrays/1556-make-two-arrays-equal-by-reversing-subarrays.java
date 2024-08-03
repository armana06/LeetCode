class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> targ = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < target.length; ++i) {
            targ.putIfAbsent(target[i], 0);
            targ.put(target[i], targ.get(target[i]) + 1);
            arrMap.putIfAbsent(arr[i], 0);
            arrMap.put(arr[i], arrMap.get(arr[i]) + 1);
        }
        for(int i = 0; i < target.length; ++i) {
            if(targ.get(target[i]) != arrMap.get(target[i])) {
                return false;
            }
        }
        return true;
    }
}