class Solution {
    public int maximumScore(int a, int b, int c) {
        int gZero = 3;
        int score = 0;
        while(gZero >= 2) { 
            if(a >= b && a >= c) {
                --a;
                if(a == 0) {
                    gZero--;
                }
                if(b > c) {
                   --b;
                    if(b == 0) {
                        gZero--;
                    }
                }
                else {
                    --c;
                    if(c == 0) {
                        gZero--;
                    }
                }
                ++score;
            }
            else if(b >= a && b >= c) {
                --b;
                if(b == 0) {
                    gZero--;
                }
                if(a > c) {
                   --a;
                    if(a == 0) {
                        gZero--;
                    }
                }
                else {
                    --c;
                    if(c == 0) {
                        gZero--;
                    }
                }
                ++score;
            }
            else if(c >= a && c >= b) {
                --c;
                if(c == 0) {
                    gZero--;
                }
                if(b > a) {
                   --b;
                    if(b == 0) {
                        gZero--;
                    }
                }
                else {
                    --a;
                    if(a == 0) {
                        gZero--;
                    }
                }
                ++score;
            }
        } 
        return score;
    }
}