class Solution {
    public int reverse(int x) {
        boolean neg = false;
        int xRev = 0;
        int temp = Math.abs(x);
        if(x < 0) {
            neg = true;
            if(temp == x) {
                return 0;
            }
        }
        for(int i = 0; i <= (int) Math.log10(Math.abs(x)); i++) {
           xRev += (temp % 10) * (Math.pow(10, (int) Math.log10(Math.abs(x)) - i));
           temp /= 10;
           if(xRev >= 2147483647) {
                return 0;
           }
        }
        if(neg) {
            return -1 * xRev;
        }
        return xRev;
    }
}
