class Solution {
    public int minOperations(String s) {
        String sMod = Character.toString(((char) (s.charAt(0) + 1)%2 + '0')) + s.substring(1);
        System.out.println(sMod);
        return Math.min(minOps(s, false), minOps(sMod, true));
    }
    int minOps(String s, boolean cm) {
        boolean fZero = false;
        int min = 0;
        if(s.charAt(0) == '0') {
            fZero = true;
        }
        for(int i = 0; i < s.length(); i++) {
            if(fZero && i%2 == 0 && s.charAt(i) == '1') {
                min++;
            }
            else if(fZero && i%2 == 1 && s.charAt(i) == '0') {
                min++;
            }
            else if(!fZero && i%2 == 0 && s.charAt(i) == '0') {
                min++;
            }
            else if(!fZero && i%2 == 1 && s.charAt(i) == '1') {
                min++;
            }
        }
        if(cm) {
            min++;
        }
        return min;
    }
}