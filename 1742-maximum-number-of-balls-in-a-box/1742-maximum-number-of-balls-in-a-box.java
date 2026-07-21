
class Solution {
    static int boxNum(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            int box=boxNum(i);
            hm.put(box,hm.getOrDefault(box,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer>e:hm.entrySet()){
            int val=e.getValue();
            max=Math.max(max,val);
        }
        return max;
    }
}