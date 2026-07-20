import java.util.ArrayList;
class Solution {
    static int nextGreater(int []nums,int val){
        int index=-1;
         for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                index = i;
                break;
            }
        }
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] > val) {
                return nums[i];
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=nextGreater(nums2,nums1[i]);
        }
        return res;
    }
}