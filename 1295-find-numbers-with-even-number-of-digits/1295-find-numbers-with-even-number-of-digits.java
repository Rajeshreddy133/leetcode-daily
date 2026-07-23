class Solution {
    static int count(int num){
        int cnt=0;
        while(num!=0){
            num/=10;
            cnt++;
        }
        return cnt;
    }
    public int findNumbers(int[] nums) {
        int finalCnt=0;
        for(int num:nums){
            int cnt=count(num);
            if(cnt%2==0){
                finalCnt++;
            }
        }
        return finalCnt;
    }
}