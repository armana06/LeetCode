class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int stu : chalk) {
            sum += stu;
        }
        long total = k % sum;
        int i = 0;
        while (total >= chalk[i]) {
            total -= chalk[i];
            i++;
        }
        return i;
    }
}