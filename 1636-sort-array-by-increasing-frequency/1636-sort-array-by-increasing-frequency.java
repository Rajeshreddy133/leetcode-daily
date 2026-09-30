class Solution {
    public int[] frequencySort(int[] nums) {
        LinkedHashMap<Integer,Integer>hm=new LinkedHashMap<>();
        int n=nums.length;
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        Arrays.sort(nums);
        Integer arr[]=new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(a,b)->{
            int f1=hm.get(a);
            int f2=hm.get(b);
            if(f1!=f2){
                return f1-f2;
            }
            return b-a;
        });
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
}