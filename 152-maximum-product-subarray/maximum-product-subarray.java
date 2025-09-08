class Solution {
    public int maxProduct(int[] nums) {
        int r=nums[0];
        for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=i;j<nums.length;j++){
                p*=nums[j];
                r=Math.max(p,r);
            }
        }
        return r;
    }
}