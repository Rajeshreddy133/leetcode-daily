class Solution {
    static int window(int[]arr,int k){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int fSum=sum;
        for(int i=k;i<n;i++){
            sum=sum-arr[i-k]+arr[i];
            fSum+=sum;
        }
        return fSum;
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=window(arr,1);
        for(int i=3;i<=n;i=i+2){
            sum+=window(arr,i);
        }
        return sum;
    }
}