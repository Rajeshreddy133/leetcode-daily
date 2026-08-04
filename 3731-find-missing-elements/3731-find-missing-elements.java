class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
         ArrayList<Integer>list=new ArrayList<>();
         HashSet<Integer>hm=new HashSet<>();
         int min=Integer.MAX_VALUE;
         int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            hm.add(nums[i]);
            if(nums[i]>max){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        for(int i=min;i<=max;i++){
            if(!hm.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}