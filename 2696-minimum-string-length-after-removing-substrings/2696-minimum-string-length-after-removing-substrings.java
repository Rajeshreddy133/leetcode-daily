class Solution {
    public int minLength(String s) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.indexOf("AB")!=-1 || sb.indexOf("CD")!=-1){
            int pos=sb.indexOf("AB");
            if(pos!=-1){
                sb.delete(pos,pos+2);
            }
            pos=sb.indexOf("CD");
            if(pos!=-1){
                sb.delete(pos,pos+2);
            }
        }
        return sb.toString().length();
    }
}