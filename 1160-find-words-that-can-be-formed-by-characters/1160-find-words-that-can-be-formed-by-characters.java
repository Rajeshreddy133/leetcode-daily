class Solution {
    public int countCharacters(String[] words, String chars) {
        int freq[]=new int[26];
        for(char ch:chars.toCharArray()){
            freq[ch-'a']++;
        }
        int res=0;
        for(String word:words){
            int temp[]=freq.clone();
            boolean flag=true;
            for(char ch:word.toCharArray()){
                if(temp[ch-'a']==0){
                    flag=false;
                    break;
                }
                temp[ch-'a']--;
            }
            if(flag){
                res+=word.length();
            }
        }
        return res;
    }
}