class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;int j=0;
        int n=g.length;int m=s.length;
        int cnt=0;
        while(i<n && j<m){
            if(g[i]<=s[j]){
                cnt++;
                 i++;j++;
            }else{
                j++;
            }
        }
        return cnt;
    }
}