class Solution {
    public static boolean window(int[]nums,int k,int target){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        if(sum>=target){
                return true;
            }
        for(int i=k;i<n;i++){
            sum=sum-nums[i-k]+nums[i];
            if(sum>=target){
                return true;
            }
        }
        return false;
    }
    public int minSubArrayLen(int target, int[] nums) {
        int low = 1, high = nums.length;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (window(nums, mid, target)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}