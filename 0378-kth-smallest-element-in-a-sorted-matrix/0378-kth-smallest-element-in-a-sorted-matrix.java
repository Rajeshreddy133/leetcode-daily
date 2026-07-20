class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int res[]=new int[matrix.length*matrix[0].length];
        int idx=0;
        for(int []row:matrix){
            for(int num:row){
                res[idx++]=num;
            }
        }
        Arrays.sort(res);
        return res[k-1];
    }
}