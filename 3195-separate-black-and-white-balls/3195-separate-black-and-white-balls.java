class Solution {
    public long minimumSteps(String s) {
        char[] strArray = s.toCharArray();
        long swaps = 0;
        int lastZero = 0;
        for(int i = 0; i < strArray.length; ++i) {
            if(strArray[i] == '0') {
                swaps += i - lastZero;
                lastZero++;
            }
        }
        return swaps;
       
    }
}