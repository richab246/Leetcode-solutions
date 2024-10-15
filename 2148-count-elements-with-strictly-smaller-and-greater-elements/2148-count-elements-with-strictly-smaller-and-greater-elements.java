class Solution {

    public int countElements(int[] nums) {

        if(nums.length < 3) return 0;
         
        int max = nums[0];
        int min = nums[0];

        for(int num : nums){
            if(num < min) min = num;
            if(num > max) max = num;
        }

        int count = 0;

        for(int num : nums){
            if(num > min && num < max){
                count++;
            }
        }

        return count;
    }
}