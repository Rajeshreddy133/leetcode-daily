class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=score.length;
        for(int i=0;i<n;i++){
            pq.add(score[i]);
        }
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(pq.poll(),"Gold Medal");
        hm.put(pq.poll(),"Silver Medal");
        hm.put(pq.poll(),"Bronze Medal");
        int rank=4;
        for(int i=3;i<n;i++){
            hm.put(pq.poll(),String.valueOf(rank));
            rank++;
        }
        String res[]=new String[n];
        for(int i=0;i<n;i++){
            res[i]=hm.get(score[i]);
        }
        return res;
    }
}