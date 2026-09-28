class Solution {
    public int maxDepth(String s) {
        Stack<Character>stack=new Stack<>();
        int cnt=0;
        int max=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
                cnt++;
            }else if(ch==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                max=Math.max(max,cnt);
                cnt--;
            }
        }
        return max;
    }
}