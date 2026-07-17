class Solution {
    static int gcd(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int prefixGcd[]=new int[n];
        int max=nums[0];
        prefixGcd[0] = nums[0];
        for (int i = 1; i < n; i++) {
            max=Math.max(max,nums[i]);
            prefixGcd[i]=gcd(max,nums[i]);
        }
        Arrays.sort(prefixGcd);
        int left=0,right=n-1;
        long result=0;
        while (left < right) {
                result+=gcd(prefixGcd[left], prefixGcd[right]);
                left++;
                right--;
             }
        return result;
    }
}