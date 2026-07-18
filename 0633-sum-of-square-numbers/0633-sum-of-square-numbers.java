class Solution {
    public boolean judgeSquareSum(int c) {
        long sqrt=(long)Math.sqrt(c);
        long left=0;long right=sqrt;
        while(left<=right){
            long val=left*left+right*right;
            if(val==c){
                return true;
            }
            else if(val<c){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}