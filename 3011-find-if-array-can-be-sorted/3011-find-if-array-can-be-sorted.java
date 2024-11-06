class Solution {

    public boolean canSortArray(int[] nums) {
        int prevMax = Integer.MIN_VALUE;
        int currMin = nums[0];
        int currMax = nums[0];
        int setBit = Integer.bitCount(nums[0]);

        for(int i=1; i<nums.length; i++){
            if(setBit == Integer.bitCount(nums[i])){
                currMin = Math.min(currMin, nums[i]);
                currMax = Math.max(currMax, nums[i]);
            }else{
                if(currMin < prevMax) return false;
                prevMax = currMax;
                setBit = Integer.bitCount(nums[i]);
                currMin = nums[i];
                currMax = nums[i];
            }
        }

        return currMin > prevMax;
        
    }
}