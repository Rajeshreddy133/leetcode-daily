class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        if(2*k+1>n){
            int res[]=new int[n];
            Arrays.fill(res,-1);
            return res;
        }
        if(n==1 || k==0){
            return nums;
        }
        int res[]=new int[n];
        long sum=0;
        for(int i=0;i<2*k+1;i++){
            sum+=nums[i];
        }
        Arrays.fill(res,-1);
        res[k]=(int)(sum/(2*k+1));
        for(int i=2*k+1;i<n;i++){
            sum=sum-nums[i-2*k-1]+nums[i];
            res[i-k]=(int)(sum/(2*k+1));
        }
        return res;
    }
}