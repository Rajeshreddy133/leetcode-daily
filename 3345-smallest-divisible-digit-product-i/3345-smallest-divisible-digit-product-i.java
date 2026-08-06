class Solution {
    static int digitProduct(int n){
        int prod=1;
        if(n==0){
            return 0;
        }
        while(n>0){
            
            prod*=(n%10);
            n/=10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        while (true) {
            if (digitProduct(n) % t == 0) {
                return n;
            }
            n++;
        }
    }
}