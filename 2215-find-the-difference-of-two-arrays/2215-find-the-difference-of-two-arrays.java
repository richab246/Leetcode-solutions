class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();

        for(int num : nums1) set1.add(num);

        for(int num : nums2) set2.add(num);

        for(int n : nums1){
            if(set2.add(n)){
                temp1.add(n);
            }
        }
        for(int n : nums2){
            if(set1.add(n)){
                temp2.add(n);
            }
        }
        res.add(temp1);
        res.add(temp2);

        return res;
    }
}