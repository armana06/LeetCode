class Solution {
    public int countSeniors(String[] details) {
        int seniors = 0;
        for(int i = 0; i < details.length; ++i) {
            if (details[i].charAt(11) > '6' || (details[i].charAt(11) == '6' && details[i].charAt(12) > '0')) {
                ++seniors;
            }
        }
        return seniors;
    }
}