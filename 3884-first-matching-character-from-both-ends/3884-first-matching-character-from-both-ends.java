class Solution {
    public int firstMatchingIndex(String s) {
        int n=s.length();
        char str[]=s.toCharArray();
        for(int i=0;i<n;i++){
            if(str[i]==str[n-i-1]){
                return i;
            }
        }
        return -1;
    }
}