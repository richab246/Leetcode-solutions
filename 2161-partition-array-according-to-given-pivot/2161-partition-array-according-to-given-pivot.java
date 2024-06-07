class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]<pivot){
                list1.add(nums[i]);
            }else if(nums[i]>pivot){
                list2.add(nums[i]);
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] == pivot){
              list1.add(nums[i]);
            }
        }

        list1.addAll(list2);
        int[] result = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            result[i] = list1.get(i);
        }
        

       return result;
    }
}