class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int idx=0;
        for(int num:nums){
            arr[idx++]=num*2;
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        for(int i=0;i<n;i++){
            if(i!=max && nums[max]<arr[i]){
                return -1;
            }
        }
        return max;
    }
}