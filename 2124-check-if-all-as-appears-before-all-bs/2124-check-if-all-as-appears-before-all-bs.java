class Solution {
    public boolean checkString(String s) {
        int pos=s.indexOf('b');
        if(pos==-1){
            return true;
        }
        int ans=s.indexOf('a',pos);
        return ans==-1;
    }
}