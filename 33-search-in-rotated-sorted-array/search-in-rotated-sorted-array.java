class Solution {
    public int search(int[] nums, int target) {
        int c=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                c=1;
                k=i;
            }
        }
        if(c==1){
            return k;
        }
        else{
            return -1;
        }
    }
}