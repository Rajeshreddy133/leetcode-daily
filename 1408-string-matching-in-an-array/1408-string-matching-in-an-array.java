class Solution {
    public List<String> stringMatching(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        List<String>list=new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(words[j].contains(words[i])){
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;
    }
}