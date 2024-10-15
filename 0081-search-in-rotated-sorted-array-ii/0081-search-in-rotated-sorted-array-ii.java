class Solution {

    public boolean sr(int[] nums, int tar, int si, int ei){
        if(si>ei){
            return false;
        }
        int mid = si+(ei-si)/2;
        if(nums[mid] == tar){
            return true;
        }else if(nums[si] < nums[mid]){
            if(nums[si] <= tar && tar < nums[mid]){
                return sr(nums, tar, si, mid-1);
            }else{
                return sr(nums, tar, mid+1, ei);
            }
        }else if(nums[si] > nums[mid]){
            if(nums[mid] < tar && tar <= nums[ei]){
                return sr(nums, tar, mid+1, ei);
            }else{
                return sr(nums, tar, si, mid-1);
            }
        }else{
            return sr(nums, tar, si+1, ei);
        }
    }

    public boolean search(int[] nums, int target) {
        return sr(nums, target, 0, nums.length-1);
    }
}