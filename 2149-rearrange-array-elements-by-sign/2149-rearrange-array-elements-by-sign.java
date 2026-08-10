class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int left=0;
        int right=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                res[left]=nums[i];
                left+=2;
            }else if(nums[i]<0){
                res[right]=nums[i];
                right+=2;
            }
        }
        return res;
    }
}