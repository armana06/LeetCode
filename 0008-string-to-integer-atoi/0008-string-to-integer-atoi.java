class Solution {
    public int myAtoi(String s) {
        int index = 0;
        int answer = 0;
        boolean sign = true;
        if(s.length() == 0) {
            return answer;
        }
        while(s.charAt(0) == ' ') {
            s = s.substring(1);
            if(s.length() == 0) {
                return answer;
            }
        }
        if(s.charAt(0) == '-') {
            sign = false;
            s = s.substring(1);
        }
        else if (s.charAt(0) == '+') {
            s = s.substring(1);
        }
        for(int i = 0; i <= s.length() - 1; i++){
            if(s.charAt(index) >= 48 && s.charAt(index) <= 59) {
                index++;
            }
            else {
                break;
            }
        }
        s = s.substring(0,index);
        if(s.equals("")) {
            return answer;
        }
        try {
            answer = Integer.parseInt(s);
        }
        catch(Exception e) {
            if(!sign) {
                return Integer.MIN_VALUE;
            }
            else {
                return 2147483647;
            }
        }
        if(sign) {
            return answer;
        }
        else {
            return -1 * answer;
        }
    }
}