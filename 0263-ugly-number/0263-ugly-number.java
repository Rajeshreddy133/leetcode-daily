class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        int[] divisors = {2, 3, 5};

        for (int x : divisors) {
            while (n % x == 0) {
                n /= x;
            }
        }

        return n == 1;
    }
}