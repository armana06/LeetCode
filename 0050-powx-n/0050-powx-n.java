class Solution {
    public double myPow(double x, int n) {
         if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }
        if(n < 0) {
            x = (1 / x);
            n = -n;
        }
        if(n == 1) {
            return x;
        }
        if (n == 0) {
            return 1;
        }
        
        if(n == 2) {
            return x * x;
        }
        if(n%2 != 0) {
            return x * myPow(x,(int) (n - 1));
        }
        
        return myPow(myPow(x, (int) (n/2)), 2);
    }
}