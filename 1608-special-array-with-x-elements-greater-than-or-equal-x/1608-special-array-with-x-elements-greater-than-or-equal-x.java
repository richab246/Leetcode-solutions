class Solution {
    public int specialArray(int[] nums) {

        Arrays.sort(nums);
        int start = 0;
        int end = nums.length;

        while(start <= end){

            int mid = start + (end - start)/2;
            int cnt = count(nums, mid);

            if(cnt == mid){
                return mid;
            }else if(cnt < mid){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
       return -1;
    }

    public int count(int[] nums, int num){
        int count = 0;

        for(int i : nums){
            if(i >= num){
                count++;
            }
        }

        return count;
    }
}