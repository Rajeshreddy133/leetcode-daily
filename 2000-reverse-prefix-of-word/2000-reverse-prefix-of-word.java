class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch)==-1){
            return word;
        }
        int pos=word.indexOf(ch);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=pos;i++){
            char c=word.charAt(i);
            sb.append(c);
        }
        sb.reverse();
        for(int i=pos+1;i<word.length();i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}