class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(i<nums.length-1 && nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int zero = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }else if(zero>0){
                int t = nums[i];
                nums[i] = 0;
                nums[i-zero] = t;
            }
        }
        return nums;
    }
}