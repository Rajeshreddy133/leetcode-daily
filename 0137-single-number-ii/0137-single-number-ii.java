class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        int result=-1;
        for(Map.Entry<Integer,Integer>e:hm.entrySet()){
            int key=e.getKey();
            int value=e.getValue();
            if(value==1){
                result=key;
                break;
            }
        }
        return result;
    }
}