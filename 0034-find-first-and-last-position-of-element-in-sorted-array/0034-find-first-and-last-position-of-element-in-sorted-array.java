class Solution {

    public int binarySearch(int[] nums, int target, boolean isLeft){
         int low = 0;
        int high = nums.length-1;
        int idx = -1;
        
        while(low <= high){
            int mid = low + (high - low)/2;

            if(target < nums[mid]){
               high = mid - 1;
            }else if(target > nums[mid]){
                low = mid+1;
            }else{
                idx = mid;
                if(isLeft){
                  high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
        }

        return idx;
    }

    public int[] searchRange(int[] nums, int target) {
       
       int[] res = {-1, -1};

       int left = binarySearch(nums, target, true);
       int right = binarySearch(nums, target, false);

       res[0] = left;
       res[1] = right;


        return res;
    }
}