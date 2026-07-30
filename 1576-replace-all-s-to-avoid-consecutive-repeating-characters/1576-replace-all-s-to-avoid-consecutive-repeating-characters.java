class Solution {
    public String modifyString(String s) {
        char arr[]=s.toCharArray();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(arr[i]=='?'){
                char prev=(i>0)? arr[i-1]:'#';
                char next=(i<n-1)? arr[i+1]:'#';
                for(char ch='a';i<'z';ch++){
                    if(ch!=prev && ch!=next){
                        arr[i]=ch;
                        break;
                    }
                } 
            }
        }
        return new String(arr);
    }
}