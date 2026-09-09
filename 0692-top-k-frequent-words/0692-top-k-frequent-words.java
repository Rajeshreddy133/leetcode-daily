class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>hm=new HashMap<>();
        for(String s:words){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        List<String>result=new ArrayList<>(hm.keySet());
        Collections.sort(result,(a,b)->{
        int freq1=hm.get(a);
        int freq2=hm.get(b);
        if(freq1!=freq2){
            return freq2-freq1;
        }
        return a.compareTo(b);});
        return result.subList(0,k);
    }
}