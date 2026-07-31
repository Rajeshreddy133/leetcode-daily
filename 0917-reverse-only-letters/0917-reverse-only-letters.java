class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        int left=0;
        int right=sb.length()-1;
        while(left<right){
            while(left<right && !Character.isLetter(sb.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetter(sb.charAt(right))){
                right--;
            }
            char temp=sb.charAt(left);
            sb.setCharAt(left,sb.charAt(right));
            sb.setCharAt(right,temp);
            left++;
            right--;
        }
        return sb.toString();
    }
}