class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer>e:hm.entrySet()){
            int key=e.getKey();
            int val=e.getValue();
            if(val==1){
                sum+=key;
            }
        }
        return sum;
    }
}